import java.util.Scanner;

public class Quen{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int yQuen, xQuen, yFigure, xFigure;

        System.out.print("x координата Ферзя: ");
        xQuen = scan.nextInt();
        System.out.print("y координата Ферзя: ");
        yQuen = scan.nextInt();
        System.out.print("x координата фигуры: ");
        xFigure = scan.nextInt();
        System.out.print("y координата фигуры: ");
        yFigure = scan.nextInt();

        boolean result = ((xQuen + yQuen == xFigure + yFigure) || (xFigure - yFigure == xQuen - yQuen)) || ((xQuen == xFigure) || (yFigure == yQuen));

        boolean quen = (Math.abs(xQuen - yQuen) == Math.abs(xFigure - yFigure)) || ((xQuen == xFigure) || (yFigure == yQuen));

        System.out.println(result);
    }
}