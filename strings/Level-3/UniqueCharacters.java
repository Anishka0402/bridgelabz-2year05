import java.util.Scanner;

public class UniqueCharacters {
    // Method to find length without length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique chars
    public static char[] findUnique(String str) {
        int n = getLength(str);
        char[] result = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[index++] = c;
            }
        }

        // Resize result
        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUnique(text);
        System.out.print("Unique Characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
