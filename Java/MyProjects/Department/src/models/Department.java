package models;

public record Department(Integer id, String name, int maxEmployeesCount) {
    public Department(String name, int maxEmployeesCount){
        this(null, name, maxEmployeesCount);
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", maxEmployeesCount: " + maxEmployeesCount +  "\n" ;
    }
}
