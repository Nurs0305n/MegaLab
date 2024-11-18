import java.util.Scanner;

public class SecondMaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber, maxNumber = -1, secondMaxNumber = -1;
        System.out.println("Ведите натуральные числа: ");

        do {
            userNumber = scan.nextInt();
            if (userNumber > maxNumber)
                maxNumber = userNumber;
            else if (userNumber > secondMaxNumber && userNumber < maxNumber)
                secondMaxNumber = userNumber;
        }while (userNumber != 0);
        System.out.println("Второе максимальное число равен: " + secondMaxNumber);

    }
}
