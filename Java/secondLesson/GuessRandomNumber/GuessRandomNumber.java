import java.util.Scanner;

public class GuessRandomNumber{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int max = 1000, min = 1, range = max - min + 1;

        int randomNumberOne = (int) (Math.random() * range) + min;
        int randomNumberTwo = (int) (Math.random() * range) + min;

        int summ = randomNumberOne + randomNumberTwo;
        int product = randomNumberOne * randomNumberTwo;

        System.out.println("Сумма чисел равен: " + summ);
        System.out.println("Произведение чисел равен: " + product);
        System.out.println("\nОтгадайте загаданные числа.");

        System.out.print("Введите первое число: ");
        int firstNumber = scan.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scan.nextInt();

        boolean verifyOne = randomNumberOne == firstNumber;
        boolean verifyTwo = randomNumberTwo == secondNumber;

        System.out.println("\nВы отгадали число?");
        System.out.println("Первое число: " + verifyOne);
        System.out.println("Второе число: " + verifyTwo);
    }
}
