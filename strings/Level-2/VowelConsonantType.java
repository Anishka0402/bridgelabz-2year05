import java.util.Scanner;

public class VowelConsonantType {
    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyzeString(String str) {
        char[] chars = str.toCharArray();
        String[][] result = new String[chars.length][2];
        for (int i = 0; i < chars.length; i++) {
            result[i][0] = String.valueOf(chars[i]);
            result[i][1] = charType(chars[i]);
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        String[][] result = analyzeString(text);
        displayTable(result);
    }
}
