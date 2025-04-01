package array;

import java.util.Scanner;

//Выровнять строки по самой длинной строке
public class TextAlignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[4];
        int maxLength = 0;

        //Запрос текста с консоли
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите текст:");
            words[i] = scanner.nextLine();
        }

        //Поиск максимальной длины
        for (String text: words){
            if (maxLength < text.length())
                maxLength = text.length();
        }

        //Выранивание текстов заполняя звездочками
        for (int i = 0; i < words.length; i++) {
            int textLength = words[i].length();

            for (int j = textLength; j < maxLength; j++) {
                words[i] += "*";
            }
        }

        //Вывод результата
        for (String s: words){
            System.out.println(s);
        }
    }
}
