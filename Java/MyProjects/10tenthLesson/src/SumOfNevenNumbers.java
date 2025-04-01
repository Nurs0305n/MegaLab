import java.util.Scanner;

public class SumOfNevenNumbers {
    public static void main(String[] args) {
        // Сумма четных чисел, в заданном диапазоне
        Scanner scan = new Scanner(System.in);

        System.out.print("Начало диапазона: ");
        int startOfRange = scan.nextInt();

        System.out.print("Конец диапазона: ");
        int endOfRange = scan.nextInt();

        int sum = 0;

        for (int i = startOfRange; i <= endOfRange; i++){
            if (i % 2 == 0)
                sum += i;
        }
        System.out.println("Сумма четных цифр: " + sum);
    }
}
