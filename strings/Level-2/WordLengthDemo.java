import java.util.Scanner;

public class WordLengthDemo {
    // Find length manually
    public static int manualLength(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) count++;
        return count;
    }

    // Split manually
    public static String[] manualSplit(String str) {
        int n = manualLength(str);

        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int index = 0;
        String temp = "";

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                words[index++] = temp;
                temp = "";
            } else {
                temp += c;
            }
        }
        words[index] = temp;
        return words;
    }

    // Return 2D array of words and their lengths
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(manualLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
