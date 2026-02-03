import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] days = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Leap year check
    public static boolean isLeap(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) return true;
        return false;
    }

    // Day of week using formula
    public static int dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void printCalendar(int month, int year) {
        if (month == 2 && isLeap(year)) days[2] = 29;
        else days[2] = 28;

        System.out.println("   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int d = dayOfWeek(1, month, year);
        for (int i = 0; i < d; i++) System.out.print("   ");

        for (int i = 1; i <= days[month]; i++) {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        printCalendar(m, y);
    }
}
