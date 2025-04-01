package array;

//Подсчитать количество чисел, делящихся на 3 нацело, и среднее арифметическое чисел с чётными значениями
public class CountNumbersDivisibleBy3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int countDivisibleBy3Numbers = 0;
        int countEvenValues = 0;
        int sumEvenValues = 0;

        //Заполнение массива
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        //Поиск чисел кратные 3-м, и колличество и сумма четных чисел кратным 3-м
        for (int n: numbers){
            if (n % 3 == 0){
                countDivisibleBy3Numbers++;
                if (n % 2 == 0){
                    countEvenValues++;
                    sumEvenValues += n;
                }
            }
        }

        //Вывод результата
        int averageValue = sumEvenValues / countEvenValues;
        System.out.println("Колличество чисел делящихся на 3: " + countDivisibleBy3Numbers);
        System.out.println("Среднее арифметическое четных чисел кратным 3: " + averageValue);
    }
}
