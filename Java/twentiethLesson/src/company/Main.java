package company;

import company.models.Employee;

import java.util.Scanner;

public class Main {
    static int employeeCount;
    static Employee[] employees = new Employee[20];
    static Scanner scanner = new Scanner(System.in);


    public static void main (String args[]){

        boolean check = true;

        while (check)
        System.out.printf("""
                Выберите действие:
                1. Добавить сотрудника
                2. Удалить сотрудника
                3. Посмотреть информацию о сотруднике
                4. Все сотрудники
                5. Остановить программу
                """);
        int move = scanner.nextInt();
        switch (move){
            case 1:
                addEmployee();
                break;
            case 2:
                deleteEmployee();
                break;
            case 3:
                
        }

    }

    private static void addEmployee() {
        Employee employee = new Employee();
        System.out.println("Имя: ");
        employee.setFirstName(scanner.nextLine());

        System.out.println("Фамилия: ");
        employee.setLastName(scanner.nextLine());

        System.out.println("Возраст: ");
        employee.settAge(scanner.nextInt());

        System.out.println("Выберите пол: " +
                "\n1. Мужчина" +
                "\n2. Женщина");
        int sex = scanner.nextInt();
        if (sex == 1)
            employee.setSex(true);
        else
            employee.setSex(false);

        System.out.println("Зарплата: ");
        employee.setSalary(scanner.nextFloat());
    }

    private static void listEmployee(){
        System.out.println("| id | First Name | Last Name | Age | Sex | Position | Salary |");
        for (int i = 0; i < employeeCount; i++) {
            Employee employee = employees[i];
            System.out.printf("| %d | %s | %s | %d | %b | %s | %d |\n", i, employee.getFirstName(), employee.getLastName(), employee.getAge(), employee.isSex(), employee.getPosition(), employee.getSalary());
        }
    }

}
