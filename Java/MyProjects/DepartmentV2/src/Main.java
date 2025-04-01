import db.impl.DepartmentRepoImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        DepartmentRepoImpl dp = new DepartmentRepoImpl();

        System.out.println(dp.findById(1));
    }
}