public class SecondExample {
    public static void main(String[] args) {
        int x, y, moveX, moveY, nextX, nextY;
        int[][] field = new int[10][10];
        x = (int)(Math.random() * 10 + 1);
        y = (int)(Math.random() * 10 + 1);
        field[x][y] = 1;

        nextX = x;
        nextY = y;
        for (int i = 0; i < 3; i++) {
            moveX = (int) (Math.random() * 3 - 2);
            moveY = (int) (Math.random() * 3 - 2);
            nextX += moveX;
            nextY += moveY;
            if ((moveX == 0 || moveY == 0) && ((nextX == x || nextY == y) && (nextY < 10 && nextX < 10 && nextX > -1 && nextY > -1))){
                field[nextX][nextY] = 1;
                x = nextX;
                y = nextY;
            }

        }

        for (int i = 0; i <field.length; i++){
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(" nums[" + i + "][" + j + "] = " + field[i][j]);
            }
            System.out.println();
        }
    }
}
