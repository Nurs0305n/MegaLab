import java.util.Scanner;

public class LeapYear{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //Год високосный, если он делится на 4, но не делится на 100, за исключением тех лет, которые делятся на 400.
        System.out.print("Введите год: ");
        int year = scan.nextInt();

        boolean leapYear = (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));

        System.out.println(leapYear);
    }
}
