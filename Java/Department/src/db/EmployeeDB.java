package db;

import ecxeptions.EmployeeNotExist;
import models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDB implements DbHelper<Employee, Integer>{
    private final PositionDB positionDB = new PositionDB();
    @Override
    public void insert(Employee employee) {
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
    public List<Employee> getList() {
        List<Employee> employees = new ArrayList<>();
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, first_name, last_name, salary, position_id from employees");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Employee employee  = new Employee(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getDouble("salary"), positionDB.getById(rs.getInt("position_id")));
                employees.add(employee);
            }

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    @Override
    public void delete(Integer id) {
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("delete from employees where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee getById(Integer id) {
        Employee employee = null;
        try {
            Connection connection = connect();
            PreparedStatement ps = connection.prepareStatement("select id, first_name, last_name, salary, position_id from employees where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                employee = new Employee(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getDouble("salary"), positionDB.getById(rs.getInt("position_id")));

            rs.close();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (employee != null)
        return employee;
        else
            throw new EmployeeNotExist();
    }
}
