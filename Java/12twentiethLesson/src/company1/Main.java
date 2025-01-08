package company1;

import company1.models.Employee;

import java.util.Scanner;

public class Main {
    static int employeeCount = 0;
    static Employee[] employees = new Employee[20];
    static Scanner scanner = new Scanner(System.in);


    public static void main (String[] args){

        boolean check = true;

        while (check) {
            System.out.print("""
                    Выберите действие:
                    1. Добавить сотрудника
                    2. Удалить сотрудника
                    3. Посмотреть информацию о сотруднике
                    4. Все сотрудники
                    5. Остановить программу
                    """);
            int move = scanner.nextInt();
            switch (move) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    System.out.print("""
                            1. Удалить по идексу
                            2. Удалить по имени и фамилии
                            """);
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        System.out.println("Введите индекс: ");
                        int index = scanner.nextInt();
                        deleteEmployee(index);
                    } else if (choice == 2) {
                        System.out.println("Введите имя: ");
                        String firstName = scanner.next();
                        System.out.println("Введите фамилию: ");
                        String lastName = scanner.next();
                        deleteEmployee(firstName, lastName);
                    }
                    break;
                case 3:
                    System.out.println("Введите индекс: ");
                    int index = scanner.nextInt();
                    showInfoEmployee();
                    break;
                case 4:
                    showInfoEmployees();
                    break;
                case 5:
                    check = false;
                    break;
                default:
                    System.out.println("Неправильное действие!");

            }
        }
    }

    private static void addEmployee() {
        Employee employee = new Employee();
        System.out.println("Имя: ");
        employee.setFirstName(scanner.next());

        System.out.println("Фамилия: ");
        employee.setLastName(scanner.next());

        System.out.println("Возраст: ");
        employee.settAge(scanner.nextInt());

        System.out.println("""
                Выберите пол:
                1. Мужчина
                2. Женщина""");
        int sex = scanner.nextInt();
        employee.setSex(sex == 1);

        System.out.println("Должность: ");
        employee.setPosition(scanner.next());

        System.out.println("Зарплата: ");
        employee.setSalary(scanner.nextFloat());

        employees[employeeCount] = employee;
        employeeCount++;
    }

    private static void deleteEmployee (int index) {
        for (int i = index; i < employeeCount - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employeeCount--;
    }

    private static void deleteEmployee (String firstName, String lastName){
        if (employeeCount > 0){
            for (int i = 0; i < employeeCount; i++) {
                if (employees[i].getFirstName().equalsIgnoreCase(firstName) && employees[i].getLastName().equalsIgnoreCase(lastName)) {
                    for (int j = i; j < employeeCount; j++) {
                            employees[j] = employees[j + 1];
                    }
                    employeeCount--;
                } else if (i == employeeCount - 1) {
                    System.out.println("Сотрудник не найден!");
                }
            }
        } else
            System.out.println("Список сотрудников пуст!");
    }

    private static void showInfoEmployee(){
        System.out.print("""
                Поиск по:
                1. Индекс
                2. Имя
                """);
        int choice = scanner.nextInt();
         if (choice == 1){
             System.out.println("Введите индекс: ");
             int index = scanner.nextInt();
            if (index < employeeCount)
                employees[index].showInfo();
            else
                System.out.println("По данному индексу нет сотрудника!");
        } else if (choice == 2){

         }
    }


    private static void showInfoEmployees(){
        if (employeeCount != 0){
            System.out.println("| id | First Name | Last Name | Age | Sex | Position | Salary |");
            for (int i = 0; i < employeeCount; i++) {
                Employee employee = employees[i];
                System.out.printf("| %d | %s | %s | %d | %b | %s | %f |\n", i, employee.getFirstName(), employee.getLastName(), employee.getAge(), employee.isSex(), employee.getPosition(), employee.getSalary());
            }
        } else
            System.out.println("Список сотрудников пуст!");
    }

}
