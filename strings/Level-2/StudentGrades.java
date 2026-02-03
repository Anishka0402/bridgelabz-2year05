import java.util.Scanner;

public class StudentGrades {
    public static String getGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];
        String[] grades = new String[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            grades[i] = getGrade(marks[i]);
        }

        System.out.println("\n--- Result Report ---");
        System.out.println("Name\tMarks\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + "\t" + marks[i] + "\t" + grades[i]);
        }
    }
}
