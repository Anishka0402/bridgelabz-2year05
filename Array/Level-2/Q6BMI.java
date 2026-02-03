// Q6BMI.java
import java.util.Scanner;
public class Q6BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);
        sc.close();
    }
}
