import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] numbers = {21, 12, 23, 213, 12, -231, -123, -45, -46, -12},  negativeNumbers, positiveNumbers;
        int negativeNumbersCount = 0;
        int indexNegativeNumbers = 0, indexPositiveNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0)
                negativeNumbersCount++;
        }
        negativeNumbers = new int[negativeNumbersCount];
        positiveNumbers = new int[numbers.length - negativeNumbersCount];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0){
                positiveNumbers[indexPositiveNumbers] = numbers[i];
                indexPositiveNumbers++;
            } else {
                negativeNumbers[indexNegativeNumbers] = numbers[i];
                indexNegativeNumbers++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length -1)
                System.out.print(", ");
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < positiveNumbers.length; i++) {
            System.out.print(positiveNumbers[i]);
            if (i != positiveNumbers.length -1)
                System.out.print(", ");
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < negativeNumbers.length; i++) {
            System.out.print(negativeNumbers[i]);
            if (i != negativeNumbers.length -1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
