package models;

public record Position(Integer id, String name, double maxSalary, Department department) {
    public Position(String name, double maxSalary, Department department){
        this(null, name, maxSalary, department);
    }
}
