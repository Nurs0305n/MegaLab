import java.util.Scanner;

public class ThreeDigitNumberDivisibleBy7And11{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int userNumber;

        System.out.print("Введите число: ");
        userNumber = scan.nextInt();

        boolean checkNumber = (userNumber > 99 && userNumber < 1000) && (userNumber % 7 == 0 && userNumber % 11 == 0);
        System.out.println(checkNumber);
    }
}