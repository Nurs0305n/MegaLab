public class Person {
    int uniqueId;
    String name;
    int age;
    String city;
    char gender;

    public void eat (String dish){
        System.out.println(name + " кушает " + dish);
    }

    public void study (String classes){
        System.out.println(name + " учится " + classes);
    }

    public void sleep (int sleepClock){
        System.out.println(name + " спит " + sleepClock + " часов");
    }

    public void play (String gameName){
        System.out.println(name + " играет " + gameName);
    }
}
