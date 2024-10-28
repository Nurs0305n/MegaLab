import java.util.Scanner;

public class Horse{
    public static void main (String[] args){
        Scanneer scan = new Scanner(System.in);
        int yHorse, xHorse, yFigure, xFigure;

        System.out.print("x координата Ладьи: ");
        xHorse = scan.nextInt();
        System.out.print("y координата Ладьи: ");
        yHorse = scan.nextInt();
        System.out.print("x координата фигуры: ");
        xFigure = scant.nextInt();
        System.out.print("y координата фигуры: ");
        yFigure = scan.nextInt();

        boolean result = (xHorse -1 == xFigure || xHorse + 1 == xFigure) && (yHorse - 2 == yFigure || yHorse + 2 == yFigure) || (yHorse -1 == yFigure || yHorse + 1 == yFigure) && (xHorse - 2 == xFigure || xHorse + 2 == xFigure);

        System.out.println(result);
    }
}