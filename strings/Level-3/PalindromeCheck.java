import java.util.Scanner;

public class PalindromeCheck {
    // Logic 1: Iterative compare
    public static boolean isPalindromeIter(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive compare
    public static boolean isPalindromeRec(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRec(str, start + 1, end - 1);
    }

    // Logic 3: Reverse and compare
    public static boolean isPalindromeArray(String str) {
        char[] original = str.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Iterative: " + isPalindromeIter(text));
        System.out.println("Recursive: " + isPalindromeRec(text, 0, text.length() - 1));
        System.out.println("Array Compare: " + isPalindromeArray(text));
    }
}
