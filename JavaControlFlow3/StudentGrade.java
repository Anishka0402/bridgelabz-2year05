import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int math = sc.nextInt();

        int total = phy + chem + math;
        double percent = total / 3.0;

        System.out.println("Average = " + percent + "%");

        if (percent >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (percent >= 75) {
            System.out.println("Grade: B (Very Good)");
        } else if (percent >= 60) {
            System.out.println("Grade: C (Good)");
        } else if (percent >= 40) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}
