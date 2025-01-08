import java.beans.Introspector;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> simbols = new HashMap<>();


        String text = scanner.nextLine();
        for (char simbol: text.toLowerCase().toCharArray()){
            if (simbols.containsKey(simbol)){
                simbols.put(simbol, simbols.get(simbol) + 1);
            }else {
                simbols.put(simbol,1);
            }
        }

    }
}