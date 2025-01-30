package models;

public class Teacher extends Human{

    public Teacher(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
