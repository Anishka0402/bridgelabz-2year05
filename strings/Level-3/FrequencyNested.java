import java.util.Scanner;

public class FrequencyNested {
    public static String[] frequency(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark visited
                }
            }
        }

        String[] result = new String[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[idx++] = chars[i] + " -> " + freq[i];
            }
        }
        String[] finalRes = new String[idx];
        for (int i = 0; i < idx; i++) finalRes[i] = result[i];
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] res = frequency(text);
        for (String r : res) System.out.println(r);
    }
}
