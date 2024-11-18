import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbersSum = 0, userNumber, zeroCount = 0;

        System.out.println("Введите числа : ");
        do {
            userNumber = scan.nextInt();
            numbersSum += userNumber;
            if (userNumber == 0)
                zeroCount++;
            else
                zeroCount = 0;
        }while (zeroCount < 2);

        System.out.println("Сумма чисел равен: " + numbersSum);
    }
}
