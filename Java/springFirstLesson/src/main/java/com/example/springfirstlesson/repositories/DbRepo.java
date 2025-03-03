package com.example.springfirstlesson.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface DbRepo<T, I> {

    String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/departments";

    default Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    void create(T t);
    void update(T t);
    List<T> getAll();
    T findById(I id);
    void delete(I id);
}
