import java.util.Scanner;

public class NumbersInWord{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число от 0 до 1000: ");
        int userNumber = scan.nextInt();

        System.out.print("Цифры прописью: ");

        if (userNumber == 0) System.out.print("ноль");
        if (userNumber == 1000) System.out.print("тысяча");

        if (userNumber >= 100){
            if (userNumber / 100 == 1)
                System.out.print("сто ");
        else if (userNumber / 100 == 2)
            System.out.print("два ");
        else if (userNumber / 100 == 3)
            System.out.print("триста ");
        else if (userNumber / 100 == 4)
            System.out.print("четыреста ");
        else if (userNumber / 100 == 5)
            System.out.print("пятсот ");
        else if (userNumber / 100 == 6)
            System.out.print("шетсот ");
        else if (userNumber / 100 == 7)
            System.out.print("семьсот ");
        else if (userNumber / 100 == 8)
            System.out.print("восемьсот ");
        else if (userNumber / 100 == 9)
            System.out.print("девятсот ");
        userNumber %= 100;
        }

        if (userNumber >= 20){
            if (userNumber / 10 == 2)
                System.out.print("двадцать ");
            else if (userNumber / 10 == 3)
                System.out.print("тридцать ");
            else if (userNumber / 10 == 4)
                System.out.print("сорок ");
            else if (userNumber / 10 == 5)
                System.out.print("пятдесят ");
            else if (userNumber / 10 == 6)
                System.out.print("шестдесят ");
            else if (userNumber / 10 == 7)
                System.out.print("семьдесят ");
            else if (userNumber / 10 == 8)
                System.out.print("восемдесят ");
            else if (userNumber / 10 == 9)
                System.out.print("девяноста ");
            userNumber %= 10;
        }else if(userNumber >= 10){
            if (userNumber == 10)
                System.out.print("десят ");
            else if (userNumber == 11)
                System.out.print("одинадцать ");
            else if (userNumber == 12)
                System.out.print("двенадцать ");
            else if (userNumber == 13)
                System.out.print("тринадцать ");
            else if (userNumber == 14)
                System.out.print("четырнадцать ");
            else if (userNumber == 15)
                System.out.print("пятнадцать ");
            else if (userNumber == 16)
                System.out.print("шестнадцать ");
            else if (userNumber == 17)
                System.out.print("семнадцать ");
            else if (userNumber == 18)
                System.out.print("восемнадцать ");
            else if (userNumber == 19)
                System.out.print("девятнадцать ");
            userNumber = 0;
        }

        if (userNumber > 0){
            if(userNumber == 1)
                System.out.print("один");
            else if(userNumber == 2)
                System.out.print("два");
            else if(userNumber == 3)
                System.out.print("три");
            else if(userNumber == 4)
                System.out.print("четыре");
            else if(userNumber == 5)
                System.out.print("пять");
            else if(userNumber == 6)
                System.out.print("шесть");
            else if(userNumber == 7)
                System.out.print("семь");
            else if(userNumber == 8)
                System.out.print("восемь");
            else if(userNumber == 9)
                System.out.print("девять");
        }
    }
}