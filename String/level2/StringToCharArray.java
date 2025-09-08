import java.util.Scanner;

class TrimSpacesManual {
    public static String trimCustom(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(text.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String trimmedCustom = trimCustom(text);
        String trimmedBuiltin = text.trim();

        System.out.println("Custom Trim: [" + trimmedCustom + "]");
        System.out.println("Built-in Trim: [" + trimmedBuiltin + "]");
    }
}
