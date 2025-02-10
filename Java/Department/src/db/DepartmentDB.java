package db;

import models.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDB implements DbHelper<Department, Integer>{
    @Override
    public void insert(Department department) {

    }

    @Override
    public void update(Department department) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update departments set name = ?, max_employees_count = ? where id = ?");
            ps.setString(1, department.name());
            ps.setInt(2, department.maxEmployeesCount());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Department> getList() {
        return List.of();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void getById(Integer id) {

    }
}
