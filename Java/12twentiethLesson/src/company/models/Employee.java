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
        return (float) salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void showInfo(){
        super.info();
        System.out.printf("""
                Должность : %s,
                Зарплата : %f
                """, position, salary);
    }
}
