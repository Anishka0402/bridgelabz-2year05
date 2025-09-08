import java.util.*;

public class UniqueCharacters {
    public static char[] findUnique(String text) {
        int n = text.length();
        char[] result = new char[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (c == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[count++] = c;
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = findUnique(text);
        System.out.println("Unique characters: " + Arrays.toString(unique));
    }
}
