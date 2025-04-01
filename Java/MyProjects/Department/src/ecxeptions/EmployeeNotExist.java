package ecxeptions;

public class EmployeeNotExist extends RuntimeException{
    public EmployeeNotExist(){
        System.out.println("Такого работника нет!");
    }
}
