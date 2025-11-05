import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a', '5', 'Z', '3'));
        for (char c : list) {
            if (Character.isDigit(c))
                System.out.println(c + " is a digit");
            else if (Character.isAlphabetic(c))
                System.out.println(c + " is an alphabet");
        }
    }
}
