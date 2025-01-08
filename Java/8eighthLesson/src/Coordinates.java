import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("X координата: ");
        int x = scan.nextInt();

        System.out.print("Y координата: ");
        int y = scan.nextInt();

        if (x > 0 && y > 0 )
            System.out.println("Первая четверть.");
        else if (x < 0 && y > 0)
            System.out.println("Вторая четверть.");
        else if (x < 0 && y < 0)
            System.out.println("Третья четверть.");
        else if(x > 0 && y < 0)
            System.out.println("Четвертая четверть");
        else
            System.out.println("Точка на оси");
    }
}