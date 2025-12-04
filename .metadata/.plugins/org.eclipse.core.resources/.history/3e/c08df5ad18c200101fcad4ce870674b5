import java.util.*;
import java.sql.Date;

public class Menu implements IMenu {

    Istudent obj = new StudentImpl();
    Scanner sc = new Scanner(System.in);

    @Override
    public void menu() {
        while (true) {
            System.out.println("\n===== Student Database Menu =====");
            System.out.println("1. Insert a Student");
            System.out.println("2. Insert Multiple Students");
            System.out.println("3. Show All Students");
            System.out.println("4. Delete Multiple Students");
            System.out.println("5. Update Multiple Students");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    insertSingleStudent();
                    break;

                case 2:
                    insertMultipleStudents();
                    break;

                case 3:
                    obj.showStudents();
                    break;

                case 4:
                    deleteMultipleStudents();
                    break;

                case 5:
                    updateMultipleStudents();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("❌ Invalid Choice! Try again.");
            }
        }
    }

    // ---------- Helper Methods ----------

    private void insertSingleStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Enrolled Date (YYYY-MM-DD): ");
        String dateStr = sc.nextLine();
        Date enrolledDate = Date.valueOf(dateStr);

        Student s = new Student(id, name, age, email, enrolledDate);
        obj.insertStudent(s);
        System.out.println("✅ 1 row inserted successfully!");
    }

    private void insertMultipleStudents() {
        System.out.print("Enter number of students to insert: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Student " + i);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Enrolled Date (YYYY-MM-DD): ");
            String dateStr = sc.nextLine();
            Date enrolledDate = Date.valueOf(dateStr);

            students.add(new Student(id, name, age, email, enrolledDate));
        }

        obj.insertMultipleStudents(students);
        System.out.println("✅ " + n + " rows inserted successfully!");
    }

    private void deleteMultipleStudents() {
        System.out.print("Enter number of students to delete: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> ids = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter ID of student " + i + " to delete: ");
            ids.add(sc.nextInt());
            sc.nextLine();
        }

        obj.deleteMultipleStudents(ids);
        System.out.println("🗑️ " + n + " records deleted successfully!");
    }

    private void updateMultipleStudents() {
        System.out.print("Enter number of students to update: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> studentsToUpdate = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Student " + i + " to update:");

            System.out.print("Enter ID of student to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Email: ");
            String email = sc.nextLine();

            System.out.print("Enter New Enrolled Date (YYYY-MM-DD): ");
            String dateStr = sc.nextLine();
            Date enrolledDate = Date.valueOf(dateStr);

            studentsToUpdate.add(new Student(id, name, age, email, enrolledDate));
        }

        obj.updateMultipleStudents(studentsToUpdate);
        System.out.println("✅ " + n + " records updated successfully!");
    }
}
