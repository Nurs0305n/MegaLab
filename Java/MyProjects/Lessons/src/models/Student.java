package models;

public class Student extends Human {
    private String email;

    public Student(Integer id, String firstName, String lastName, String email) {
        super(id, firstName, lastName);
        this.email = email;
    }

    public Student(String firstName, String lastName, String email) {
        super(firstName, lastName);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
