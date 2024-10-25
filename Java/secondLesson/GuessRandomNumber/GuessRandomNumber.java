import java.util.Scanner;

public class GuessRandomNumber{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int max = 10, min = 1, range = max - min + 1;

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

        boolean result = (randomNumberOne == firstNumber && randomNumberTwo == secondNumber) || (randomNumberOne == secondNumber && randomNumberTwo == firstNumber);
         ;

        System.out.println("\nВы отгадали число?");
        System.out.println(result);

        System.out.printf("\nПервое число: %d \nВторое число : %d\n", randomNumberOne, randomNumberTwo);
    }
}
