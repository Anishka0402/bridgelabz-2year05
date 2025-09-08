import java.util.*;

public class FrequencyUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = new char[text.length()];
        int uCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean exists = false;
            for (int j = 0; j < uCount; j++) {
                if (unique[j] == c) { exists = true; break; }
            }
            if (!exists) unique[uCount++] = c;
        }

        System.out.println("Character Frequency:");
        for (int i = 0; i < uCount; i++) {
            char c = unique[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++)
                if (text.charAt(j) == c) count++;
            System.out.println(c + " : " + count);
        }
    }
}
