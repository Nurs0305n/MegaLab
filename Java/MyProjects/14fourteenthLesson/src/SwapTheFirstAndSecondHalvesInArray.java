public class SwapTheFirstAndSecondHalvesInArray {
    public static void main(String[] args) {
        int[] firstArray = {45, 41, 26, 34, 79, 65, 45, 78, 21}, numbers2 = new int[firstArray.length];
        int middleIndex = firstArray.length / 2;
        for (int i = 0; i < middleIndex; i++) {
            if (firstArray.length % 2 == 0) {
                numbers2[i] = firstArray[i + middleIndex];
                numbers2[i + middleIndex] = firstArray[i];
            } else {
                numbers2[i] = firstArray[i + middleIndex + 1];
                numbers2[i + middleIndex + 1] = firstArray[i];
                if (i == 0)
                    numbers2[middleIndex] = firstArray[middleIndex];

            }
        }

        System.out.print("[");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i != numbers2.length -1)
                System.out.print(", ");
        }
        System.out.println("]");

    }
}
