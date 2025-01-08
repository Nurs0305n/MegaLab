import java.util.Scanner;

public class DayOfTheWeek{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userNumber;

        System.out.print("Выберите день недели от 1 до 7: ");
        userNumber = scan.nextInt();

        if(userNumber == 1) System.out.println("Понедельник");
        else if(userNumber == 2) System.out.println("Вторник");
        else if(userNumber == 3) System.out.println("Среда");
        else if(userNumber == 4) System.out.println("Четверг");
        else if(userNumber == 5) System.out.println("Пятница");
        else if(userNumber == 6) System.out.println("Суббота");
        else if(userNumber == 7) System.out.println("Воскресенье");
        else  System.out.println("Неправильная цифра.");
    }
}