package parking2.operators;

import parking2.models.Car;
import parking2.models.CheckIn;

import java.util.Date;

public class Operator {
    private CheckIn[] checkIns;

    public Operator (int parkingSize){
        checkIns = new CheckIn[parkingSize];
    }

    public void checkIn (String carNumber){
        Car car = new Car(carNumber);
        CheckIn checkIn = new CheckIn();
        checkIn.setCar(car);
        checkIn.setEntryDate(new Date());
        for (int i = 0; i < checkIns.length; i++) {
            if (checkIns[i] != null) {
                if (checkIns[i].getCar().getCarNumber().equals(carNumber))
                    break;
            } else {
                checkIns[i] = checkIn;
                break;
            }
        }
    }

    public void checkOut (String carNumber){
        CheckIn checkIn = null;
        for (CheckIn checkIns: checkIns){
            if (checkIns.getCar().getCarNumber().equals(carNumber)) {
                checkIn = checkIns;
                return;
            }
        }
        if (checkIn == null){
            System.out.println("Машина не найдена!");
            return;
        }

        checkIn.setExitDate(new Date());

        long millis = checkIn.getEntryDate().getTime() - checkIn.getExitDate().getTime();
        long seconds = millis  / 1000;

        if (seconds < 15)
            return;
        else  {
            double minutes = Math.ceil((double) seconds / 60);
            checkIn.setPrice(minutes * 50);
        }

        System.out.println("Открывается шлагбаум!");
    }

    public void show (){
        for (CheckIn element: checkIns){
            if (element != null)
                System.out.println("Car number: " + element.getCar().getCarNumber() + ". \nPrice: " + element.getPrice() + "\n");

        }
    }

}
