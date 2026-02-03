import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        sc.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nEligibility Report:");
        for (int i = 0; i < n; i++) {
            if (ages[i] >= 18) {
                System.out.println(names[i] + " is Eligible to vote");
            } else {
                System.out.println(names[i] + " is Not Eligible to vote");
            }
        }
    }
}
