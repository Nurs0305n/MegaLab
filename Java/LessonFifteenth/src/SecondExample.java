public class SecondExample {
    public static void main(String[] args) {
        int x, y, move, lastMove = 0, moveCount = 0;
        int[][] field = new int[10][10];
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        field[x][y] = 1;

        while (moveCount < 7) {
            move = (int) (Math.random() * 4 + 1);
            int newX = x, newY = y;

            switch (move) {
                case 1 -> newX++;
                case 2 -> newY++;
                case 3 -> newY--;
                case 4 -> newX--;
            }

            if (move != lastMove && newX >= 0 && newX < 10 && newY >= 0 && newY < 10) {
                if (field[newX][newY] != 1) {
                    x = newX;
                    y = newY;
                    field[x][y] = 1;
                    moveCount++;
                }
                lastMove = Math.abs(move - 5);
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                //System.out.print(" nums[" + i + "][" + j + "] = " + field[i][j]);
                System.out.print(field[i][j] + " ");

            }
            System.out.println();
        }
    }
}
