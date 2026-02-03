import java.util.Scanner;

public class ManualTrim {
    // Manual length
    public static int manualLength(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) count++;
        return count;
    }

    // Manual trim
    public static String manualTrim(String str) {
        int n = manualLength(str);
        int start = 0, end = n - 1;

        // skip leading spaces
        while (start < n && str.charAt(start) == ' ') {
            start++;
        }
        // skip trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with spaces: ");
        String text = sc.nextLine();

        String trimmed = manualTrim(text);

        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: [" + trimmed + "]");
    }
}
