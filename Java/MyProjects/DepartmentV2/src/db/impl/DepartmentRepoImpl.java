package db.impl;

import db.DepartmentRepo;
import exeptions.DepartmentNotExist;
import models.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepoImpl implements DepartmentRepo {
    @Override
    public void create(Department department) {
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

        System.out.println("Отдел добавлен!");
    }

    @Override
    public void update(Department department) {

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update departments set name = ?, max_employees_count where  id = ?");
            ps.setString(1, department.name());
            ps.setInt(2, department.maxEmployeesCount());
            ps.setInt(3, department.id());

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Отдел изменен!");

    }

    @Override
    public List<Department> getAll() {
        List<Department> departments = new ArrayList<>();

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, name, max_employees_count from departments");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Department department = new Department(rs.getInt("id"), rs.getString("name"), rs.getInt("max_employees_count"));
                departments.add(department);
            }

            ps.close();
            rs.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }

    @Override
    public Department findById(Integer id) {

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, name, max_employees_count from departments where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
                return new Department(rs.getInt("id"), rs.getString("name"), rs.getInt("max_employees_count"));
            else
                throw new DepartmentNotExist();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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

        System.out.println("Отдел удален!");
    }
}
