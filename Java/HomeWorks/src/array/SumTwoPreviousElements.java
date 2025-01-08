package array;

//Сумма двух предыдущих элементов массива
/*Дан одномерный массив числовых значений, насчитывающий N элементов.
Вместо каждого элемента с нулевым значением поставить сумму двух предыдущих элементов массива.*/
public class SumTwoPreviousElements {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        //Заполнение массива
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = (int)(Math.random() * 5);

        //Присваивание сумму двух предыдущих элементов вместо нуля
        for (int i = 0; i < numbers.length; i++) {
            if (i < 2 && numbers[i] == 0)
                numbers[i] = 1;
            else if (numbers[i] == 0)
                numbers[i] = numbers[i-1] + numbers[i -2];

        }

        //Вывод результата
        for (int i: numbers)
            System.out.print(i + " ");
    }
}
