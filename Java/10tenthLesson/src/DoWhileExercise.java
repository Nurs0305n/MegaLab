import java.util.Scanner;

public class DoWhileExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите число: ");
            number = scan.nextInt();
        } while (number >= 0);
        System.out.println("До свидания!");

    }
}
