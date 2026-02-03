import java.util.Scanner;

public class SubstringDemo {
    // Create substring manually
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manual = manualSubstring(str, start, end);
        String builtin = str.substring(start, end);

        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtin);

        if (compareStrings(manual, builtin)) {
            System.out.println("✅ Both substrings match");
        } else {
            System.out.println("❌ Substrings do not match");
        }
    }
}
