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
            System.out.println("Please enter a positive natural number!");
        } else {
            int sumRec = sumRecursive(n);
            int sumForm = sumFormula(n);

            System.out.println("Sum using recursion = " + sumRec);
            System.out.println("Sum using formula = " + sumForm);

            if (sumRec == sumForm)
                System.out.println("Both results are correct ✅");
            else
                System.out.println("Results don't match ❌");
        }
        sc.close();
    }
}
