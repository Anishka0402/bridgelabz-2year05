import java.util.Scanner;

public class FrequencyChar {
    public static String[][] frequency(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        String[][] result = new String[str.length()][2];
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c] > 0) {
                result[idx][0] = String.valueOf(c);
                result[idx][1] = String.valueOf(freq[c]);
                freq[c] = 0; // avoid duplicate
                idx++;
            }
        }

        String[][] finalResult = new String[idx][2];
        for (int i = 0; i < idx; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = frequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : result) {
            System.out.println("   " + row[0] + "      |   " + row[1]);
        }
    }
}
