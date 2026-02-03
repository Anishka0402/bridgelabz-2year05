import java.util.Scanner;

public class StringLengthDemo {
    // Method to find length without using length()
    public static int manualLength(String str) {
        int count = 0;
        // Keep checking until we can’t access further
        while (true) {
            if (count >= str.toCharArray().length) break; 
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int manualLen = manualLength(text);
        int builtinLen = text.length();

        System.out.println("Manual Length: " + manualLen);
        System.out.println("Built-in Length: " + builtinLen);
    }
}
