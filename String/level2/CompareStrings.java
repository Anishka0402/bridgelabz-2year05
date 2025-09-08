import java.util.Scanner;

class SplitTextCompare {
    public static String[] customSplit(String text) {
        text = text.trim();
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                sb.append(text.charAt(i));
            } else {
                words[index++] = sb.toString();
                sb.setLength(0);
            }
        }
        words[index] = sb.toString();
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Custom split:");
        for (String w : custom) System.out.print(w + " ");
        System.out.println("\nBuilt-in split:");
        for (String w : builtin) System.out.print(w + " ");

        System.out.println("\nAre both same? " + compareArrays(custom, builtin));
    }
}
