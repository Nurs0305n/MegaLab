import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите три числа: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b && b == c)
            System.out.println("Все числа одинаковые");
        else if (a == b || b == c || c == a)
            System.out.println("Два числа одинаковые");
        else
            System.out.println("Нет одинаковых чисел");

    }
}
