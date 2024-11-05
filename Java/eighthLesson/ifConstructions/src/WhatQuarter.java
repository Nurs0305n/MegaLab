import java.util.Scanner;

public class WhatQuarter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите цифру месяца от 1 до 12: ");
        int month = scan.nextInt();

        if (month > 0 && month < 4)
            System.out.println("Первый квартал");
        else if (month > 3 && month < 7)
            System.out.println("Второй квартал");
        else if (month > 6 && month < 10)
            System.out.println("Третий квартал");
        else if (month > 9 && month < 13)
            System.out.println("Четвертый квартал");
        else
            System.out.println("Неправильная цифра");
    }
}
