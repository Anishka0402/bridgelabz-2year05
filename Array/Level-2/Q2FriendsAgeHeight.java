// Q2FriendsAgeHeight.java
import java.util.Scanner;
public class Q2FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first friend’s age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter first friend’s height (cm): ");
        int h1 = sc.nextInt();

        System.out.print("Enter second friend’s age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter second friend’s height (cm): ");
        int h2 = sc.nextInt();

        if (age1 > age2) {
            System.out.println("Older friend has age " + age1 + " and height " + h1);
        } else {
            System.out.println("Older friend has age " + age2 + " and height " + h2);
        }
        sc.close();
    }
}
