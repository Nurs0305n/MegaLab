package ecxeptions;

public class DepartmentNotExist extends RuntimeException {
    public DepartmentNotExist(){
        System.out.println("Такого отдела нет!");
    }
}
