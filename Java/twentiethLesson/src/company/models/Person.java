package company.models;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean sex;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void settAge (int age){
        if (age > 0)
            this.age = age;
        System.out.println("error");
    }

    public void info(){
        System.out.printf("""
                First name: %s,
                Last name: %s,
                Age: %d,
                Sex: %b
                """);
    }
}
