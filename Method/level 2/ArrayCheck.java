import java.util.Scanner;

public class ArrayCheck {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            if (!isPositive(arr[i])) {
                System.out.println(arr[i] + " is Negative");
            } else {
                if (isEven(arr[i]))
                    System.out.println(arr[i] + " is Positive & Even");
                else
                    System.out.println(arr[i] + " is Positive & Odd");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result > 0) System.out.println("First is Greater than Last");
        else System.out.println("First is Smaller than Last");

        sc.close();
    }
}
