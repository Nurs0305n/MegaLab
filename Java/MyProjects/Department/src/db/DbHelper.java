package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface DbHelper<T, I> {
    String url = "jdbc:sqlite:/home/nurs/MegaLab/Databases/departments.db"; //Linux
//    String url = "jdbc:sqlite:D:/Java/Lessons/MegaLab/Databases/EmployeesDb.db"; //Windows
    default Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    void insert(T t);
    void update(T t);
    List<T> getList();
    void delete(I id);
    T getById(I id);
}
