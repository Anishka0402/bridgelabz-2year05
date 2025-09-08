import java.util.Scanner;

class StringLengthWithoutMethod {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtinLength = text.length();

        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtinLength);
    }
}
