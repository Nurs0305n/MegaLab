import java.util.Scanner;

public class DescriptionLaptop{
  public static void main (String[] args){
	  Scanner scna = new Scanner(System.in);

	  int randomNumber = (int) (Math.random() * 5 + 1);

      System.out.print("Отгадайте число: ");
      int userNumber = scan.nextInt();

      boolean checkAnswer = randemNumber == userNumber;

      System.out.pritn(checkAnswer);
  }
}
