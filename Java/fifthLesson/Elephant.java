import java.util.Scanner;

public class Elephant{
    public static void main (String[] args){
        Scanneer scan = new Scanner(System.in);
        int yElephant, xElephant, yFigure, xFigure;

        System.out.print("x координата слона: ");
        xElephant = scan.nextInt();
        System.out.print("y координата слона: ");
        yElephant = scan.nextInt();
        System.out.print("x координата фигуры: ");
        xFigure = scant.nextInt();
        System.out.print("y координата фигуры: ");
        yFigure = scan.nextInt();

        boolean result = (xElephant + yElephant == xFigure + yFigure) || (xFigure - yFigure == xElephant - yElephant);

        System.out.println(result);
    }
}