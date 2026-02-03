import java.util.Scanner;

public class ShortestLongestDemo {
    // Manual length
    public static int manualLength(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) count++;
        return count;
    }

    // Manual split
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

    // 2D array with word + length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(manualLength(words[i]));
        }
        return result;
    }

    // Find shortest and longest
    public static int[] findShortestLongest(String[][] table) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < Integer.parseInt(table[shortest][1])) shortest = i;
            if (len > Integer.parseInt(table[longest][1])) longest = i;
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordsWithLength(words);
        int[] result = findShortestLongest(table);

        System.out.println("Shortest word: " + table[result[0]][0] +
                           " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest word: " + table[result[1]][0] +
                           " (Length: " + table[result[1]][1] + ")");
    }
}
