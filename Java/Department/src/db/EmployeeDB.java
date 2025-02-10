package db;

import models.Employee;

import java.util.List;

public class EmployeeDB implements DbHelper<Employee, Integer>{
    @Override
    public void insert(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public List<Employee> getList() {
        return List.of();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void getById(Integer id) {

    }
}
