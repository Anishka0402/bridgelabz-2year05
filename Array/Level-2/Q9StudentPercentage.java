// Q9StudentPercentage.java
import java.util.Scanner;
public class Q9StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in 5 subjects (out of 100): ");
        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt(), s4 = sc.nextInt(), s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage >= 90) System.out.println("Grade A");
        else if (percentage >= 80) System.out.println("Grade B");
        else if (percentage >= 70) System.out.println("Grade C");
        else if (percentage >= 60) System.out.println("Grade D");
        else System.out.println("Grade F");

        sc.close();
    }
}
