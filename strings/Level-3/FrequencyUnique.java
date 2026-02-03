import java.util.Scanner;

public class FrequencyUnique {
    // Find unique chars
    public static char[] findUnique(String str) {
        int n = str.length();
        char[] result = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) result[index++] = c;
        }
        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++) finalResult[i] = result[i];
        return finalResult;
    }

    // Frequency
    public static String[][] frequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) freq[str.charAt(i)]++;

        char[] uniques = findUnique(str);
        String[][] result = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(freq[uniques[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] res = frequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : res) {
            System.out.println("   " + row[0] + "      |   " + row[1]);
        }
    }
}
