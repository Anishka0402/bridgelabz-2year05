import java.util.Scanner;

public class StringSplitDemo {
    // Method to find length manually without using length()
    public static int manualLength(String str) {
        char[] chars = str.toCharArray();  // convert to char array
        int count = 0;
        for (char c : chars) {
            count++;
        }
        return count;
    }

    // Method to split manually
    public static String[] manualSplit(String str) {
        int n = manualLength(str);

        // count words
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

    // Compare arrays
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Manual Split:");
        for (String w : manual) System.out.println(w);

        System.out.println("\nBuilt-in Split:");
        for (String w : builtin) System.out.println(w);

        if (compareArrays(manual, builtin)) {
            System.out.println("\n✅ Both methods give the same result");
        } else {
            System.out.println("\n❌ Results differ");
        }
    }
}
