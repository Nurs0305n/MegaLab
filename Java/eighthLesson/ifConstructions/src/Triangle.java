import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Первая сторона треугольника: ");
        int firstSide = scan.nextInt();

        System.out.print("Вторая сторона треугольника: ");
        int secondSide = scan.nextInt();

        System.out.print("Третея сторона треугольника: ");
        int thirdSide = scan.nextInt();

        if (firstSide == secondSide && secondSide == thirdSide)
            System.out.println("Равносторонний треугольник");
        else if (firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide)
            System.out.println("Равнобедренный треугольник");
        else
            System.out.println("Разносторонний треугольник");
    }
}
