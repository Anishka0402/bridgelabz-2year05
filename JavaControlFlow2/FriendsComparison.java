import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int age1 = sc.nextInt(); int h1 = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int age2 = sc.nextInt(); int h2 = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int age3 = sc.nextInt(); int h3 = sc.nextInt();

        // Youngest
        if (age1 < age2 && age1 < age3) 
            System.out.println("Amar is the youngest.");
        else if (age2 < age1 && age2 < age3)
            System.out.println("Akbar is the youngest.");
        else
            System.out.println("Anthony is the youngest.");

        // Tallest
        if (h1 > h2 && h1 > h3) 
            System.out.println("Amar is the tallest.");
        else if (h2 > h1 && h2 > h3)
            System.out.println("Akbar is the tallest.");
        else
            System.out.println("Anthony is the tallest.");
    }
}
