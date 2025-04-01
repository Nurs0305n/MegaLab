public class ArrayExerciseOne {
    public static void main(String[] args) {
        int[] numbers = {123, 46, 57, 34, 2, 7, 8};

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0)
                numbers[i] /= 2;
            else
                numbers[i] *= 2;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
