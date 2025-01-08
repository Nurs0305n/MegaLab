public class ArrayExerciseTwo {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 10 + 1);
            System.out.println(numbers[i]);
        }
    }
}
