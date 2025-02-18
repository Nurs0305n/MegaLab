package db.impl;

import db.DbHelper;
import ecxeptions.CarNotExist;
import ecxeptions.CarsListEmpty;
import models.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarRepo implements DbHelper<Car, Integer> {
    @Override
    public void create(Car car) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("insert into cars(car_number) values (?)");
            ps.setString(1, car.carNumber());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Car car) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update cars set car_number = ? where id = ?");
            ps.setString(1, car.carNumber());
            ps.setInt(2, car.id());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Car> getAll() {
        List<Car> cars = new ArrayList<>();

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, car_number from cars");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Car car = new Car(rs.getInt("id"), rs.getString("car_number"));
                cars.add(car);
            }

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (!cars.isEmpty())
            return cars;
        else
            throw new CarsListEmpty();
    }

    @Override
    public void delete(Integer id) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("delete from cars where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Car getById(Integer id) {
        Car car = null;

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, car_number from cars where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
                car = new Car(rs.getInt("id"), rs.getString("car_number"));

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (car != null)
            return car;
        else
            throw new CarNotExist();
    }
}
