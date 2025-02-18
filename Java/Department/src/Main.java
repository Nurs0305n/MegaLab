import models.Department;
import models.Employee;
import models.Position;
import services.DepartmentService;
import services.EmployeeService;
import services.PositionService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DepartmentService departmentService = new DepartmentService();
        PositionService positionService = new PositionService();
        EmployeeService employeeService = new EmployeeService();

//        Department department = new Department("Legal", 10);
//        Position position = new Position("Layer", 45000,departmentService.getById(2));
//        Employee employee = new Employee("Kudi", "Abdanbekov", 40000, positionService.getById(2));x

//        departmentService.create(department);
//        positionService.create(position);
//        employeeService.create(employee);

        List<Department> departments =  departmentService.getList();
        List<Position> positions = positionService.getList();
        List<Employee> employees = employeeService.getList();

        for (Department item: departments)
            System.out.println(item.toString());

        for (Position item: positions)
            System.out.println(item.toString());

        for (Employee item: employees)
            System.out.println(item.toString());

//        System.out.println(employee.position().department().name());
    }
}