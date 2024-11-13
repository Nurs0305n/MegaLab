import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moneyAmount, interest, needMoneyAmount, yearAmount = 0;

        System.out.print("Количество денег: ");
        moneyAmount = scanner.nextInt();
        System.out.print("Проценты: ");
        interest = scanner.nextInt();
        System.out.print("Сколько надо: ");
        needMoneyAmount = scanner.nextInt();

        while (moneyAmount < needMoneyAmount){
            moneyAmount += (int)((double)moneyAmount * interest / 100);
            yearAmount++;
        }
        System.out.println("Деньги: " + moneyAmount);
        System.out.println("Лет " + yearAmount);

    }
}
