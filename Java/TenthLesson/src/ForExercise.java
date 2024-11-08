import java.util.Scanner;

public class ForExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("\n%d * %d = %d", userNumber, i, userNumber * i);
        }
    }
}
