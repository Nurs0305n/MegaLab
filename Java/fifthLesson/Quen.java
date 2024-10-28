import java.util.Scanner;

public class Quen{
    public static void main (String[] args){
        Scanneer scan = new Scanner(System.in);
        int yQuen, xQuen, yFigure, xFigure;

        System.out.print("x координата Ферзь: ");
        xQuen = scan.nextInt();
        System.out.print("y координата  Ферзь: ");
        yQuen = scan.nextInt();
        System.out.print("x координата фигуры: ");
        xFigure = scant.nextInt();
        System.out.print("y координата фигуры: ");
        yFigure = scan.nextInt();

        boolean result = ((xQuen + yQuen == xFigure + yFigure) || (xFigure - yFigure == xQuen - yQuen)) || ((xQuen == xFigure) || (yFigure == yQuen));

        System.out.println(result);
    }
}