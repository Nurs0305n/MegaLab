import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNumber, countIdenticalNumber = 1, identicalNumber = 0, maxCountIdenticalNumber = 0;

        do {
            System.out.print("Введите цифру: ");
            userNumber = scanner.nextInt();
            if (userNumber == identicalNumber)
                countIdenticalNumber++;
            else {
                identicalNumber = userNumber;
                countIdenticalNumber = 1;
            }

            if (countIdenticalNumber > maxCountIdenticalNumber)
                maxCountIdenticalNumber = countIdenticalNumber;
        } while (userNumber != 0);

        System.out.println("Максимальное число поледовательных одинаковых цифр: " + maxCountIdenticalNumber);
    }
}
