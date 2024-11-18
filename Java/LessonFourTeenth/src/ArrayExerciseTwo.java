public class ArrayExerciseTwo {
    public static void main(String[] args) {
        int[] firstArray = {1, 134, -45, -4, 45, 369, -95, -13, 95},  sumAndCountPositiveNumbers= new int[firstArray.length + 2];
        int sum = 0, countPositiveNumbers = 0;

        for (int i = 0; i < firstArray.length; i++) {
            sum += firstArray[i];
            if (firstArray[i] > 0)
                countPositiveNumbers++;
        }

        for (int i = 0; i < firstArray.length; i++) {
            sumAndCountPositiveNumbers[i + 2] = firstArray[i];
        }

        sumAndCountPositiveNumbers[0] = sum;
        sumAndCountPositiveNumbers[1] = countPositiveNumbers;

        for (int i = 0; i < sumAndCountPositiveNumbers.length; i++) {
            System.out.println(sumAndCountPositiveNumbers[i]);
        }

    }
}
