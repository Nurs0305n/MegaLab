package services;

import db.EmployeeDB;
import models.Employee;

import java.util.List;

public class EmployeeService implements CRUDService<Employee, Integer> {
    private final EmployeeDB employeeDB = new EmployeeDB();
    @Override
    public void create(Employee employee) {
        employeeDB.insert(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDB.update(employee);
    }

    @Override
    public List<Employee> getList() {
        return employeeDB.getList();
    }

    @Override
    public void delete(Integer id) {
        employeeDB.delete(id);
    }

    @Override
    public Employee getById(Integer id) {
        return employeeDB.getById(id);
    }
}
