import java.util.Scanner;

public class Wages{
  public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
  //О – оклад работника,
    System.out.print("Оклад: ");
    int salary = scan.nextInt();
  //Дк – количество календарных дней по производственному календарю,
    System.out.print("Сколько рабочих дней: ");
    int allWorkDay = scan.nextInt();
  //Дф – количество фактически отработанных дней,
    System.out.print("Сколько отбработанных дней: ");
    int workDays = scan.nextInt();
  //П – премии и надбавки, стимулирующие и мотивирующие выплаты (могут устанавливаться в определенной сумме или зависеть от определенных факторов),
    System.out.print("Премии: ");
    int awards = scan.nextInt();
  //Н – налог на доход физического лица, который составляет 13%,
    double task = (double)(salary + awards) * 0.13;
  //У – различные удержания (алименты, штрафы)
    System.out.print("Штрафы: ");
    int fines = scan.nextInt();
    
  //Здесь ЗП – заработная плата по окладу
  //ЗП = О/Дк * Дф + П – Н — У
    int wages = (int) ((double)(salary / allWorkDay) * workDays + awards - task - fines);
    System.out.println("Заработная плата: " + wages);
  }
}
