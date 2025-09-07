import java.util.Scanner;

public class DivideChocolates {
    public static int[] divideChocolates(int chocolates, int children) {
        int eachChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachChild, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter children: ");
        int children = sc.nextInt();

        int[] result = divideChocolates(chocolates, children);
        System.out.println("Each child gets " + result[0] + " chocolates, Remaining = " + result[1]);
        sc.close();
    }
}
