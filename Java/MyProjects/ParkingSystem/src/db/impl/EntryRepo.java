package db.impl;

import db.DbHelper;
import ecxeptions.EntriesListEmpty;
import ecxeptions.EntryNotExist;
import models.Entry;
import services.EntryService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntryRepo implements DbHelper<Entry, Integer> {
    private final TariffRepo tariffRepo = new TariffRepo();
    private final CarRepo carRepo = new CarRepo();
    private final EntryService entryService = new EntryService();
    private final SimpleDateFormat formater = new SimpleDateFormat("yyyy.MM.dd HH:mm");
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
                Entry entry = new Entry(rs.getInt("id"), formater.parse(rs.getString("start_date")), formater.parse(rs.getString("end_date")), rs.getDouble("total_price"), carRepo.getById(rs.getInt("car_id")), tariffRepo.getById(rs.getInt("tariff_id")));
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
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("delete from entries where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Entry getById(Integer id) {
        Entry entry = null;

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, start_date, end_date, total_price, car_id, tariff_id from entries where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getString("end_date") != null)
                    entry = new Entry(rs.getInt("id"), formater.parse(rs.getString("start_date")), formater.parse(rs.getString("end_date")), rs.getDouble("total_price"), carRepo.getById(rs.getInt("car_id")), tariffRepo.getById(rs.getInt("tariff_id")));
                else
                    entry = new Entry(rs.getInt("id"), formater.parse(rs.getString("start_date")), carRepo.getById(rs.getInt("car_id")));
            }
            rs.close();
            ps.close();
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (entry == null)
            return entry;
        else
            throw new EntryNotExist();
    }

    public Entry goOut(Entry entry) {
        Entry entry1 = null;
        try {
            entry1 = new Entry(
                    entry.id(),
                    entry.startDate(),
                    new Date(),
                    entryService.getTotalPrice(entry.startDate(), new Date(), tariffRepo.getTariffByMinute(entryService.getMinute(entry.startDate(), new Date()))),
                    entry.car(),
                    tariffRepo.getTariffByMinute(entryService.getMinute(entry.startDate(), new Date())));

            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update entries set end_date = ?, total_price = ?, tariff_id = ? where id = ?");
            ps.setString(1, formater.format(entry1.endDate()));
            ps.setDouble(2, entryService.getTotalPrice(entry1));
            ps.setInt(3, entry1.tariff().id());
            ps.setInt(4, entry1.id());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return entry1;
    }


}
