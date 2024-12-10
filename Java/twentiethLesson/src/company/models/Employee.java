package company.models;

public class Employee extends Person{
    String position;
    float salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void info(){
        super.info();
        System.out.printf("""
                Position: %s,
                Salary: %f
                """);
    }
}
