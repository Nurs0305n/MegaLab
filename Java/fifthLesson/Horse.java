import java.util.Scanner;

public class Horse{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int yHorse, xHorse, yFigure, xFigure;

        System.out.print("x координата Коня: ");
        xHorse = scan.nextInt();
        System.out.print("y координата Коня: ");
        yHorse = scan.nextInt();
        System.out.print("x координата фигуры: ");
        xFigure = scan.nextInt();
        System.out.print("y координата фигуры: ");
        yFigure = scan.nextInt();

        boolean result = (xHorse -1 == xFigure || xHorse + 1 == xFigure) && (yHorse - 2 == yFigure || yHorse + 2 == yFigure) || (yHorse -1 == yFigure || yHorse + 1 == yFigure) && (xHorse - 2 == xFigure || xHorse + 2 == xFigure);
        
        boolean horse = (Math.abs(xHorse - xFigure) == 1 && Math.abs(yHorse - yFigure) == 2) || (Math.abs(xHorse - xFigure) == 2 && Math.abs(yHorse - yFigure) == 1)
        System.out.println(result);
    }
}