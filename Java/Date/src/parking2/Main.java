package parking2;

import parking2.operators.Operator;

import java.util.Scanner;

public class Main {
    public static void main (String[] a){
        Operator operator = new Operator(5);

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("1. Заезд \n" +
                    "2. Выезд \n" +
                    "3. Список\n" +
                    "Другая цифра. остановка программы\n" +
                    "Выберите действие: ");
            int action = scan.nextInt();
            if (action == 1){
                System.out.print("Car: ");
                String carNumber = scan.next();
                operator.checkIn(carNumber);
            }else if (action == 2){
                System.out.print("Car: ");
                String carNumber = scan.next();
                operator.checkOut(carNumber);
            }else if (action == 3){
                operator.show();
            }else
                break;

        }
    }
}
