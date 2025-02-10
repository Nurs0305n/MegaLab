import models.Department;
import models.Employee;
import models.Position;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("IT", 10);
        Position position = new Position("Development", 40000,department);
        Employee employee = new Employee("Marlen", "Abdanbekov", 35000, position);

        System.out.println(employee.position().department().name());
    }
}