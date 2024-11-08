import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100 + 1);
        int userNumber = 0;

        System.out.println("Введите 0 чтобв остановить программу.");

        while (randomNumber != userNumber){
            System.out.println("Введите число");
            userNumber = scan.nextInt();

            if (userNumber == 0){
                System.out.println("Игра окончена!");
                break;
            }

            if (userNumber > randomNumber)
                System.out.println("Ваше число больше");
            else if (userNumber < randomNumber)
                System.out.println("Ваше число меньше");
            else
                System.out.println("Правильно!");
        }

    }
}
