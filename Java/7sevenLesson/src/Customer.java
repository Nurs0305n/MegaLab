import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("phone price: ");
        int phonePrice = scan.nextInt();

        System.out.print("customer's money: ");
        int customersMoney = scan.nextInt();

        if (customersMoney >= phonePrice){
            System.out.println(("Customer can buy phone"));
            customersMoney -= phonePrice;
            System.out.println("customer's money: " + customersMoney);
        } else
            System.out.println("not enough!");

    }
}
