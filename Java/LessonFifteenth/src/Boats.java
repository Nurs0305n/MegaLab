public class Boats {
    public static void main(String[] args) {
        int x, y, move, lastMove = 0, moveCount = 0;
        int[][] field = new int[10][10];
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);
        field[x][y] = 1;

        while (moveCount < 9) {
            move = (int) (Math.random() * 4 + 1);

            int newX = x, newY = y;

            // Выбираем новое направление
            switch (move) {
                case 1:
                    newX++;// вниз
                    break;
                case 2:
                    newY++;// вправо
                    break;
                case 3:
                    newY--; // влево
                    break;
                case 4:
                    newX--; // вверх
                    break;
            }

            // Проверяем корректность хода
            if (move != lastMove && newX >= 0 && newX < 10 && newY >= 0 && newY < 10) {
                if (field[newX][newY] == 0) {
                    x = newX;
                    y = newY;
                    field[x][y] = 1;
                    moveCount++;
                }
                lastMove = (move + 2) % 4 + 1; // Обратное направление
            }
        }

        // Вывод игрового поля
        for (int[] row : field) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
