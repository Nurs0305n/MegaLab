package services;

import db.DepartmentDB;
import models.Department;

import java.util.List;

public class DepartmentService implements CRUDService<Department, Integer> {
    private final DepartmentDB departmentDB = new DepartmentDB();
    @Override
    public void create(Department department) {
        departmentDB.insert(department);
    }

    @Override
    public void update(Department department) {
        departmentDB.update(department);
    }

    @Override
    public List<Department> getList() {
        return departmentDB.getList();
    }

    @Override
    public void delete(Integer id) {
        departmentDB.delete(id);
    }

    @Override
    public Department getById(Integer id) {
        return departmentDB.getById(id);
    }
}
