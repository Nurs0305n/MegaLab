import java.util.Arrays;

public class FirstExample {
    public static void main(String[] args) {
        int[][] nums = new int[10][7];

        for (int i = 0; i <nums.length; i++){
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 9 + 1);
            }
        }

        int numberCount = 0;

        for (int i = 0; i <nums.length; i++){
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(" nums[" + i + "][" + j + "] = " + nums[i][j]);
            }
            System.out.println();
        }
    }
}
