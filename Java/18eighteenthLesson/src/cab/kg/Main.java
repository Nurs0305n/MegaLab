package cab.kg;

import cab.kg.models.*;

public class Main {
    public static void main (String[] a){

        Fuel fuel = new Fuel("Бензин");
        Transmission transmission = new Transmission("Автоматическая");
        CarType carType = new CarType("Седан");
        DriveType driveType = new DriveType("Передний");
        Price[] prices = {new Price(2000, 2500, new Currency("KGZ")), new Price(2500, 3000, new Currency("RUB")), new Price(250, 350, new Currency("USD"))};

       Car car = new Car(
               "Toyota Corolla", carType, driveType, 4, 2, 4, transmission, 2012, fuel, 13, true, prices
       );
    }
}
