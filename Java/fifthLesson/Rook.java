import java.util.Scanner;

public class Rook{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int yRook, xRook, yFigure, xFigure;

        System.out.print("x координата Ладьи: ");
        xRook = scan.nextInt();
        System.out.print("y координата Ладьи: ");
        yRook = scan.nextInt();
        System.out.print("x координата фигуры: ");
        xFigure = scan.nextInt();
        System.out.print("y координата фигуры: ");
        yFigure = scan.nextInt();

        boolean result = (xRook == xFigure) || (yFigure == yRook);

        System.out.println(result);
    }
}