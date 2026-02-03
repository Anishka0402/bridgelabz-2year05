import java.util.Scanner;

public class VowelConsonantCount {
    // Check if vowel, consonant, or not a letter
    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32); // convert to lowercase
        }
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    // Count vowels and consonants
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            String type = charType(c);
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
