package db;

import ecxeptions.EntriesListEmpty;
import models.Entry;
import models.Tariff;
import services.EntryService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EntryDb implements DbHelper<Entry, Integer> {
    private final TariffDb tariffDb = new TariffDb();
    private final CarDb carDb = new CarDb();
    private final EntryService entryService = new EntryService();
    private final SimpleDateFormat formater = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    @Override
    public void create(Entry entry) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("insert into entries(start_date, car_id) values (?,?)");
            ps.setString(1, formater.format(entry.startDate()));
            ps.setInt(2, entry.car().id());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Entry entry) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update entries set start_date = ?, end_date = ?, total_price = ?, car_id = ?, tariff_id = ? where id = ?");
            ps.setString(1,formater.format(entry.startDate()));
            ps.setString(2, formater.format(entry.endDate()));
            ps.setDouble(3, entryService.getTotalPrice(entry));
            ps.setInt(4, entry.car().id());
            ps.setInt(5, entry.tariff().id());
            ps.setInt(6, entry.id());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Entry> getAll() {
        List<Entry> entries = new ArrayList<>();
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, start_date, end_date, total_price, car_id, tariff_id from entries");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Entry entry = new Entry(rs.getInt("id"), formater.parse(rs.getString("start_date")), formater.parse(rs.getString("end_date")), rs.getDouble("total_price"), carDb.getById(rs.getInt("car_id")), tariffDb.getById(rs.getInt("tariff_id")));
                entries.add(entry);
            }

            rs.close();
            ps.close();
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (!entries.isEmpty())
            return entries;
        else
            throw new EntriesListEmpty();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Entry getById(Integer id) {
        return null;
    }
}
