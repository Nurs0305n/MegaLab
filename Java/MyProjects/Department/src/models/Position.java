package models;

public record Position(Integer id, String name, double maxSalary, Department department) {
    public Position(String name, double maxSalary, Department department){
        this(null, name, maxSalary, department);
    }

    @Override
    public String toString() {
        return "id: " +  id +
                ", name: "+ name +
                ", maxSalary: " + maxSalary +
                ", departmentId: " + department().id() +
                "\n";
    }
}
