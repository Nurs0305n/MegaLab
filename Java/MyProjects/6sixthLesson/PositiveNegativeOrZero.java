import java.util.Scanner;

public class PositiveNegativeOrZero{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int userNumber;

        System.out.print("Введите цифру: ");
        userNumber = scan.nextInt();

        if (userNumber > 0) System.out.print("Вы ввели положительную цифру.");
        else if (userNumber < 0) System.out.print("Вы ввели отрицательную цифру.");
        else System.out.print("Вы ввели ноль.");
    }

}