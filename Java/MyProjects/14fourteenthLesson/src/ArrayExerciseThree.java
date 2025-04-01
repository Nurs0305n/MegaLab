import java.util.Scanner;

public class ArrayExerciseThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArray = {45, 41, 26, 34, 79}, secondArray = {65, 45, 78}, thirdArray;
        int indexFirstArray = 0;
        int starIndex = scan.nextInt();
        thirdArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < thirdArray.length; i++) {
            if ( i == starIndex){
                for (int j = 0; j < secondArray.length; j++) {
                    thirdArray[i] = secondArray[j];
                    System.out.println(i);
                    i++;
                }
            } else {
                thirdArray[i] = firstArray[indexFirstArray];
                indexFirstArray++;
                System.out.println(i);
            }
        }


        System.out.print("[");
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i != thirdArray.length -1)
                System.out.print(", ");
        }
        System.out.println("]");

    }
}
