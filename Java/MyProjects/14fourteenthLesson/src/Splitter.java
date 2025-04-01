import java.util.Scanner;

public class Splitter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.print("Введите первое число: ");
        firstNumber = scan.nextInt();
        System.out.print("Введите второе число: ");
        secondNumber = scan.nextInt();

        while (firstNumber != secondNumber){
            if (firstNumber / 2 < secondNumber || firstNumber % 2 != 0){
                firstNumber--;
                System.out.println("-1");
            } else{
                firstNumber /= 2;
                System.out.println(":2");
            }
        }
    }
}
