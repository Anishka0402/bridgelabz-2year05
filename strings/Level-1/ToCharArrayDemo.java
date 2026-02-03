import java.util.Scanner;

public class ToCharArrayDemo {
    // Convert manually
    public static char[] manualToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Compare char arrays
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] manual = manualToCharArray(str);
        char[] builtin = str.toCharArray();

        System.out.println("Manual toCharArray: " + new String(manual));
        System.out.println("Built-in toCharArray: " + new String(builtin));

        if (compareCharArrays(manual, builtin)) {
            System.out.println("✅ Both arrays are same");
        } else {
            System.out.println("❌ Arrays differ");
        }
    }
}
