import java.util.Scanner;

class VowelConsonantType {
    public static String checkCharType(char c) {
        if (Character.isLetter(c)) {
            char lower = Character.toLowerCase(c);
            if ("aeiou".indexOf(lower) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + "\t" + checkCharType(text.charAt(i)));
        }
    }
}
