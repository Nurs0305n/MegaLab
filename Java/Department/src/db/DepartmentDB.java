package db;

import ecxeptions.DepartmentNotExist;
import models.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDB implements DbHelper<Department, Integer>{
    @Override
    public void insert(Department department) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("insert into departments(name, max_employees_count) values (?,?)");
            ps.setString(1, department.name());
            ps.setInt(2, department.maxEmployeesCount());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Department department) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update departments set name = ?, max_employees_count = ? where id = ?");
            ps.setString(1, department.name());
            ps.setInt(2, department.maxEmployeesCount());
            ps.setInt(3, department.id());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Department> getList() {
        List<Department> departments = new ArrayList<>();
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, name, max_employees_count from departments");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Department department = new Department(rs.getInt("id"), rs.getString("name"), rs.getInt("max_employees_count"));
                departments.add(department);
            }

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return departments;
    }

    @Override
    public void delete(Integer id) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("delete from departments where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Department getById(Integer id) {
        Department department =null;
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, name, max_employees_count from departments where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                department = new Department(rs.getInt("id"), rs.getString("name"), rs.getInt("max_employees_count"));

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (department != null)
            return department;
        else
            throw new DepartmentNotExist();
    }
}
