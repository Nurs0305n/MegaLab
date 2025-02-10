package db;

import models.Flat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FlatDb implements DbHelper<Flat, Integer> {
    @Override
    public void insert(Flat flat) {

    }

    @Override
    public void update(Flat flat) {

    }

    @Override
    public List<Flat> getAll() {
        return List.of();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Flat findById(Integer id) {
        Flat flat = new Flat();

        return flat;
    }
}

