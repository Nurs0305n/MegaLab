import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Car car = new Car();
        car.brand = "Tesla";
        car.model = "model P";
        car.maxSpeed = 180;
        car.currentSpeed = 100;

        car.drive(10);
        car.drive(20);
        car.drive(30);
        car.drive(40);
        car.drive(10);

        car.turnToLeft();
        car.turnToRight();
        car.stop();
        car.turnToRight();
        car.turnToLeft();
        car.drive(30);
        car.turnToLeft();
        Person john = new Person();
        john.uniqueId = 1;
        john.name = "John";
        john.age = 35;
        john.city = "Delfi";
        john.gender = 'M';

        john.eat("shaurma");
        john.study("programming");
        john.sleep(9);
        john.play("Mobile Legends");

        Person dessy = new Person();
        dessy.uniqueId = 2;
        dessy.name = "Dessy";
        dessy.age = 20;
        dessy.city = "Pune";
        dessy.gender = 'F';

        System.out.println();
        dessy.eat("ponchik");
        dessy.study("English");
        dessy.sleep(7);
        dessy.play("Genshin Inpact");
*/
        Day day = new Day();

        for (int i = 0; i < 30; i += 3){
            System.out.println(day.dayTime(i));
        }



    }
}
