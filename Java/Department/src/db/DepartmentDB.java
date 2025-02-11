package db;

import models.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Department getById(Integer id) {
        Department department =null;
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select * from departments where id = ?");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                department = new Department(rs.getInt("id"), rs.getString("name"), rs.getInt("max_employees_count"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }
}
