import java.util.Scanner;

public class Elephant{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int yElephant, xElephant, yFigure, xFigure;

        System.out.print("x координата слона: ");
        xElephant = scan.nextInt();
        System.out.print("y координата слона: ");
        yElephant = scan.nextInt();
        System.out.print("x координата фигуры: ");
        xFigure = scan.nextInt();
        System.out.print("y координата фигуры: ");
        yFigure = scan.nextInt();

        boolean result = (xElephant + yElephant == xFigure + yFigure) || (xFigure - yFigure == xElephant - yElephant);

        boolean elephant = (Math.abs(xElephant - yElephant) == Math.abs(xFigure - yFigure));

        System.out.println(result);
    }
}