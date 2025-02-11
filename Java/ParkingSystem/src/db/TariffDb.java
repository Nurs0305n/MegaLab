package db;

import ecxeptions.TariffNotExist;
import models.Tariff;
import services.TariffService;

import java.sql.*;

public class TariffDb implements DbHelper<Tariff, Integer> {
    public Tariff getTariffByMinute(int minute) {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, to_minute, price FROM tariffs where to_minute >= ? order by to_minute limit 1");
            preparedStatement.setInt(1, minute);
            ResultSet resultSet = preparedStatement.executeQuery();
            connection.close();
            preparedStatement.close();
            if ((resultSet.next())){
                Tariff tariff = new Tariff(resultSet.getInt("id"), resultSet.getInt("to_minute"), resultSet.getInt("price"));
                return tariff;
            } else {
                throw new TariffNotExist();
            }
            resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(Tariff tariff) {
        try {
            Connection connection = connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Tariff tariff) {

    }

    @Override
    public void delete(Tariff tariff) {

    }

    @Override
    public Tariff getById(Integer id) {
        return null;
    }
}
