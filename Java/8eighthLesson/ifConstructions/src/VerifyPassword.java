import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "0101";

        System.out.print("Введите пароль: ");
        String insertPassword = scan.nextLine();

        if (password.equals(insertPassword))
            System.out.println("Достуа разрешен.");
        else
            System.out.println("Доступ запрещен.");
    }
}
