package array;

/*Сумму элементов массива и количество положительных элементов поставить на первое и второе место.
* Дан одномерный массив числовых значений, насчитывающий N элементов.
* Сумму элементов массива и количество положительных элементов поставить на первое и второе место.
* */
public class SumArrayElementsAndCountPositiveNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        int sumElements = 0, countPositiveNumbers = 0;

        //Заполнение массива
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = (int)(Math.random() * 10 - 5);

        //Сложение элементов и подсчет положительных чисел
        for (int i = 0; i < numbers.length; i++) {
            sumElements += numbers[i];
            if (numbers[i] > 0)
                countPositiveNumbers++;
        }

        int[] newArray = new int[numbers.length + 2]; //Массив для добавления суммы элементов и количество положительных чисел
        newArray[0] = sumElements;
        newArray[1] = countPositiveNumbers;

        //Перезапись массива
        for (int i = 0; i < numbers.length; i++)
            newArray[i + 2] = numbers[i];
        numbers = newArray;

        //Вывод результата
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0)
                System.out.println("Сумма элементов: " + numbers[i]);
            else if (i == 1)
                System.out.println("Колличество положительных чисел: " + numbers[i]);
            else
                System.out.print(numbers[i] + " ");
        }
    }
}
