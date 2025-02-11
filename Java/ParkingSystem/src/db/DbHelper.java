package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DbHelper<T, I> {
    String url = "jdbc:sqlite:/root/nurs/MegaLab/Databases/parking_service.db";
    default Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    void create(T t);
    void update(T t);
    void delete(T t);
    T getById(I id);
}
