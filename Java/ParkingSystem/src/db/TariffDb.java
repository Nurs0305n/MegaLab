package db;

import ecxeptions.TariffNotExist;
import ecxeptions.TariffsListEmpty;
import models.Tariff;
import services.TariffService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TariffDb implements DbHelper<Tariff, Integer> {
    public Tariff getTariffByMinute(int minute) {
        Tariff tariff = null;
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, to_minute, price FROM tariffs where to_minute >= ? order by to_minute limit 1");
            preparedStatement.setInt(1, minute);
            ResultSet resultSet = preparedStatement.executeQuery();
            connection.close();
            preparedStatement.close();
            if ((resultSet.next()))
                tariff = new Tariff(resultSet.getInt("id"), resultSet.getInt("to_minute"), resultSet.getInt("price"));

            resultSet.close();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (tariff.id() != 0)
            return tariff;
        else
            throw new TariffNotExist();
    }

    @Override
    public void create(Tariff tariff) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("insert into tariffs(to_minute, price) values(?,?)");
            ps.setInt(1, tariff.toMinute());
            ps.setInt(2, tariff.price());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Tariff tariff) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update tariffs set to_minute = ?, price = ? where id = ?");
            ps.setInt(1, tariff.toMinute());
            ps.setInt(2, tariff.price());
            ps.setInt(3, tariff.id());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Tariff> getAll() {
        List<Tariff> tariffs = new ArrayList<>();
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, to_minute, price from tariffs");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Tariff tariff = new Tariff(rs.getInt("id"), rs.getInt("to_minute"), rs.getInt("price"));
                tariffs.add(tariff);
            }

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (!tariffs.isEmpty())
            return tariffs;
        else
            throw new TariffsListEmpty();
    }

    @Override
    public void delete(Integer id) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("delete from tariffs where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Tariff getById(Integer id) {
        Tariff tariff = null;
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, to_minute, price from tariffs where id = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
                tariff = new Tariff(rs.getInt("id"), rs.getInt("to_minute"), rs.getInt("price"));

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (tariff != null)
            return tariff;
        else
            throw new TariffNotExist();
    }
}
