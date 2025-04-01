package array;


//Два подряд идущих нуля
/*Дан одномерный массив числовых значений, насчитывающий N элементов.
Определить, имеются ли в массиве два подряд идущих нуля.
 */

public class TwoConsecutiveZeros {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        boolean isTwoConsecutiveZeros = false;
        int countZeros = 0;

        //Заполнение массива
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        //Проверка есть ли два подряд идущих нуля
        for (int i: numbers) {

            if (countZeros == 2){
                isTwoConsecutiveZeros = true;
                break;
            } else {
                if (i == 0)
                    countZeros++;
                else
                    countZeros = 0;
            }

        }

         //Вывод результата
        System.out.println("Есть ли два подряд идущих нуля: " + isTwoConsecutiveZeros);

    }


}
