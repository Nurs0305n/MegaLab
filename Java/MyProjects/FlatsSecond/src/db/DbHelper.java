package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface DbHelper <T, S>{

    String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/flats/flats_db.db";

    default Connection connect() throws SQLException {
            return DriverManager.getConnection(url);
    }

    default void close(Connection connection) throws SQLException {
            connection.close();
    }

    void insert(T t);
    void update(T t);
    List<T> getAll();
    void delete(S id);
    T findById(S id);

}
