
import java.util.*;

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s, int i, int j) {
        if (i>=j) return true;
        if (s.charAt(i)!=s.charAt(j)) return false;
        return isPalindromeRecursive(s, i+1, j-1);
    }

    public static boolean isPalindromeCharArray(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length-1-i];
        return Arrays.equals(arr, rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        System.out.println("Method1: " + isPalindrome(s));
        System.out.println("Method2: " + isPalindromeRecursive(s,0,s.length()-1));
        System.out.println("Method3: " + isPalindromeCharArray(s));
    }
}
