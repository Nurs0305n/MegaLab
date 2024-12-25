import java.beans.Introspector;
import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<Character, Integer> simbols = new HashMap<>();


        String text = scan.nextLine();
        for (char simbol: text.toLowerCase().toCharArray()){
            if (simbols.containsKey(simbol)){
                simbols.put(simbol, simbols.get(simbol) + 1);
            }else {
                simbols.put(simbol,1);
            }
        }

    }
}