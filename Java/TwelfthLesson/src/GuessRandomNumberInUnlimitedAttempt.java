import java.util.Map;
import java.util.Scanner;

public class GuessRandomNumberInUnlimitedAttempt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber, randomNumber = (int) (Math.random() * 101);

        do {
            System.out.print("Введите цифру: ");
            userNumber = scanner.nextInt();

            if (userNumber > randomNumber)
                System.out.println("Ваше число больше");
            else if (userNumber < randomNumber)
                System.out.println("Ваше число меньше");
        }while (userNumber != randomNumber);
    }
}
