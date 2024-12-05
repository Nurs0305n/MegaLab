package parking1;

import parking1.operators.Operator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator(10);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Выберите действие: 1. заезд, 2. выезд, 3. отчет или (любая другая цифра) остановка программы: ");
            int mode = scanner.nextInt();

            if (mode == 1){
                System.out.println("Car: ");
                String carNumber = scanner.next();
                operator.checkIn(carNumber);
            } else if (mode == 2){
                System.out.print("Car: ");
                String carNumber = scanner.next();
                operator.checkOut(carNumber);
            } else if (mode == 3){
                operator.show();
            }else
                break;
        }
    }
}
