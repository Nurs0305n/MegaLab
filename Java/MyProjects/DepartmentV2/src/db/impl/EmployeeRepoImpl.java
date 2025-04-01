package db.impl;

import db.EmployeeRepo;
import models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo{

    @Override
    public void create(Employee employee) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("insert into employees(first_name, last_name, salary, position_id) values (?,?,?,?)");
            ps.setString(1, employee.firstName());
            ps.setString(2, employee.lastName());
            ps.setDouble(3, employee.salary());
            ps.setInt(4, employee.position().id());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Employee employee) {

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("update employees set first_name = ?, last_name = ?, salary = ?, position_id = ? where id = ?");
            ps.setString(1, employee.firstName());
            ps.setString(2, employee.lastName());
            ps.setDouble(3, employee.salary());
            ps.setInt(4, employee.position().id());
            ps.setInt(5, employee.id());
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();

        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, first_name, last_name, salary, position_id from employees");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Employee employee = new Employee(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getDouble("salary"), PositionRepoImpl.findById(rs.getInt("position_id")));
                employees.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return employees;
    }

    @Override
    public Employee findById(Integer id) {

        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
