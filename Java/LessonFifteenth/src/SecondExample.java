public class SecondExample {
    public static void main(String[] args) {
        int x, y, move, lastMove = 0;
        int[][] field = new int[10][10];
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        field[x][y] = 1;

        for (int i = 0; i < 3; i++) {
            move = (int) (Math.random() * 4 + 1);
            if (move == 1 && x < 9 && move != lastMove) {
                field[++x][y] = 1;
                lastMove = Math.abs(move - 5);
            } else if (move == 2 && y < 9 && move != lastMove) {
                field[x][++y] = 1;
                lastMove = Math.abs(move - 5);
            } else if (move == 3 && y > 0 && move != lastMove) {
                field[x][--y] = 1;
                lastMove = Math.abs(move - 5);
            } else if (move == 4 && x > 0 && move != lastMove) {
                field[--x][y] = 1;
                lastMove = Math.abs(move - 5);
            } else
                i--;
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(" nums[" + i + "][" + j + "] = " + field[i][j]);
            }
            System.out.println();
        }
    }
}
