package models;

public record Employee(Integer id, String firstName, String lastName, double salary, Position position) {
    public Employee(String firstName, String lastName, double salary, Position position){
        this(null, firstName, lastName, salary, position);
    }
}
