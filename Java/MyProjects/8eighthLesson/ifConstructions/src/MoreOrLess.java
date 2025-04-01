import java.util.Scanner;

public class MoreOrLess {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Первое число: ");
        int firstNumber = scan.nextInt();

        System.out.print("Второе число: ");
        int secondNumber = scan.nextInt();

        if (firstNumber != secondNumber)
            System.out.println(firstNumber > secondNumber ?
                    "Первое число больше." :
                    "Второе число больше"
            );
        else
            System.out.println("Числа равны.");
    }
}
