import models.Person;
import models.Region;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Mara", 20);

        System.out.println(person.age());
        System.out.println(person.name());

    }
}