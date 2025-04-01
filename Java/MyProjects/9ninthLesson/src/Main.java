import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 101);

        boolean isGuessedNumber = false;

        for (int i = 0; i < 5 && !isGuessedNumber; i++) {
            System.out.print("Введите число: ");
            int insertNumber = scan.nextInt();

            if (insertNumber == randomNumber) {
                isGuessedNumber = true;
                System.out.println("Вы отгадали число.");
            }
            else if (i == 4)
                System.out.println("Вы не отгадали число, правильное число " + randomNumber);
        }


    }
}