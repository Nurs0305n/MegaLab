package array;

import java.util.Scanner;

/*
Дан одномерный массив числовых значений, насчитывающий N элементов.
Вставить группу из M новых элементов, начиная с позиции K.
*/
public class InsertNewGroupElementsStartingAtTheSelectedPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {6, 3, 2, 10, 10, 2};
        int[] secondArrayNumbers = {15, 20};
        int position = 0;

        System.out.println("Выберите позицию от 1 до " + (numbers.length + 1));
        position = scanner.nextInt() - 1;


        //Перезапись массива
        int[] newArray = new int[numbers.length + secondArrayNumbers.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i == position){ //Запись второго массива с выбранной позиции
                for (int j = 0; j < secondArrayNumbers.length; j++) {
                    newArray[i] = secondArrayNumbers[j];
                    i++;
                }
                i--;
            } else if (i > position)//Запись первого массива после записи второго массива
                newArray[i] = numbers[i - secondArrayNumbers.length];
            else //Запись первого массива
                newArray[i] = numbers[i];
        }
        numbers = newArray;

        //Вывод результата
        for (int n: numbers){
            System.out.print(n + " ");
        }
    }
}


