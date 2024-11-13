import java.util.Scanner;

public class ArrayExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSymbolCount = 0;
        String[] strings = new String[5];

        for (int i = 0; i < strings.length; i++){
            strings[i] = scanner.next();
        }

        for (int i = 0; i < strings.length; i++){
            if (strings[i].length() > maxSymbolCount)
                maxSymbolCount = strings[i].length();
        }

        for (int i = 0; i < strings.length; i++){
            int needSymbol = maxSymbolCount - strings[i].length();
            for (int j = 0; j < needSymbol; j++){
                strings[i] = "*" + strings[i];
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
