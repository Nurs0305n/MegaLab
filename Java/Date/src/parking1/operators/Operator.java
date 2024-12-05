package parking1.operators;

import parking1.models.Car;
import parking1.models.CheckIn;

import java.util.Date;

public class Operator {
    private CheckIn[] checkIns;

    public Operator(int placesCount) {
        this.checkIns = new CheckIn[placesCount];
    }

    public void checkIn(String carNumber) {
        Car car = new Car(carNumber);
        CheckIn checkIn = new CheckIn();
        checkIn.setCar(car);
        checkIn.setEnterDate(new Date());

        for (int i = 0; i < checkIns.length; i++) {
            if (carNumber.equals(checkIns[i]))
                break;
            else if (checkIns[i] == null) {
                checkIns[i] = checkIn;
                break;
            }
        }
    }

    public void checkOut(String carNumber) {
        CheckIn checkIn = null;
        for (int i = 0; i < checkIns.length; i++) {
            if (checkIns[i].getCar().getCarNumber().equals(carNumber)) {
                checkIn = checkIns[i];

//                CheckIn[] newCheckIns = checkIns;
//                for (int j = i; j < checkIns.length - 1; j++) {
//                    newCheckIns[j] = checkIns[j + 1];
//                }
//                checkIns = newCheckIns;
                break;
            }

            if (checkIn == null) {
                System.out.println("Машина не найдена!");
                return;
            }
        }
        checkIn.setQuitDate(new Date());

        long millis = checkIn.getQuitDate().getTime() - checkIn.getEnterDate().getTime();
        long diffSeconds = millis / 1000;


        if (diffSeconds < 15) {
            checkIn.setPrice(0);
        } else {
            double diffMinutes = Math.ceil((double) diffSeconds / 60);
            checkIn.setPrice(100 * diffMinutes);
        }

        System.out.println("Открывается шлагбаум!");

    }

    public void show() {
        for (CheckIn checkIn : checkIns) {
            if (checkIn != null)
                System.out.println("Car number: " + checkIn.getCar().getCarNumber() + ". Price = " + checkIn.getPrice());
        }
    }
}
