package exeptions;

public class DepartmentNotExist extends RuntimeException {
    public DepartmentNotExist(){
        System.out.println("Такого отдела не существует!");
        getMessage();
    }
}
