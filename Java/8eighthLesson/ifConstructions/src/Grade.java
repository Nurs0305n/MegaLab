import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Баллы за тест: ");
        int points = scan.nextInt();

        if (points >= 90 && points <= 100)
            System.out.println("Отлично");
        else if (points >= 80 && points < 90)
            System.out.println("Хорошо");
        else if (points >= 70 && points < 80)
            System.out.println("Удовлетворительно");
        else if (points >= 0 && points < 70)
            System.out.println("Неудовлетворительно");
        else
            System.out.println("Незвестное число!");
    }
}
