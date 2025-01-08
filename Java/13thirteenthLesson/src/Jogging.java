import java.util.Scanner;

public class Jogging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moneyAmount;
        int interest = 10, needMoneyAmount, yearAmount = 0;

        System.out.print("Сколько пробежал в первый день: ");
        moneyAmount = scanner.nextInt();
        System.out.print("Сколько нужно пробежать: ");
        needMoneyAmount = scanner.nextInt();

        while (moneyAmount < needMoneyAmount) {
            moneyAmount += moneyAmount * interest / 100;
            yearAmount++;
        }
        System.out.println("Пробежал: " + moneyAmount);
        System.out.println("День " + yearAmount);

    }
}
