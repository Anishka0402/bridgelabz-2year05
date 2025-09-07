import java.util.Scanner;

public class SumNaturalRecursive {
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
        } else {
            int rec = sumRecursive(n);
            int form = sumFormula(n);
            System.out.println("Recursive sum = " + rec);
            System.out.println("Formula sum = " + form);
            System.out.println(rec == form ? "Both match ✅" : "Mismatch ❌");
        }
        sc.close();
    }
}
