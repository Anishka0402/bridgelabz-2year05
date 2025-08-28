// Q10DigitFrequency.java
import java.util.Scanner;
public class Q10DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        int[] freq = new int[10];
        for (char ch : num.toCharArray()) {
            if (Character.isDigit(ch)) {
                freq[ch - '0']++;
            }
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
        sc.close();
    }
}
