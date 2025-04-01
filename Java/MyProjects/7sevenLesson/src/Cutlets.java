import java.util.Scanner;

public class Cutlets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k; //Вместимость сковородки
        int m; //Время прожарки
        int n; //Количество котлет
        int result; //Время провжарки всех котлет

        System.out.print("Введите вместимость сковородки: ");
        k = scan.nextInt();

        System.out.print("Сколько нужно минут для прожарки: ");
        m = scan.nextInt();

        System.out.print("Введите колличество котлет: ");
        n = scan.nextInt();

        boolean isNotZeroAndNegative = k > 0 && m > 0 && n > 0;

        if (k >= n && isNotZeroAndNegative){
            result = m * 2;
            System.out.println("Время прожарки всех равна: " + result);
        }
        else if (n % k == 0 && isNotZeroAndNegative){
            result = (m * 2) * (n / k);
            System.out.println("Время прожарки всех равна: " + result);
        }
        else  if (isNotZeroAndNegative){
            result = (m * 2) * (n / k + 1);
            System.out.println("Время прожарки всех равна: " + result);
        }
        else {
            System.out.println(
                    "Вы ввели ноль или отрицательное число.\n" +
                    "Нужно число больше нуля!"
            );
        }
    }
}
