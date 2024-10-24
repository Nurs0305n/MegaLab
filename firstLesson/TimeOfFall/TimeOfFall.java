import java.util.Scanner;

public class TimeOfFall{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		final double accelerationOfGravity = 9.81; //м/с^2
		
		System.out.println("Программа для определения времени падения с высоты.");
		
		System.out.print("Введите высоту в метрах: ");
		int height = input.nextInt();
		
		int timeOfFall = (int) Math.sqrt(2 * height / accelerationOfGravity);
		
		System.out.printf("Время падения с высоты равна: %d сек." , timeOfFall);
		
		
	}
	
	
	
}
