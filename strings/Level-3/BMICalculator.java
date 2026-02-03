import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert cm → m
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        return new String[]{
            String.format("%.1f", heightCm),
            String.format("%.1f", weight),
            String.format("%.2f", bmi),
            status
        };
    }

    // Method to process all members
    public static String[][] processTeam(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            result[i] = calculateBMI(hw[i][0], hw[i][1]);
        }
        return result;
    }

    // Display table
    public static void display(String[][] arr) {
        System.out.printf("%-10s %-10s %-10s %-12s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : arr) {
            System.out.printf("%-10s %-10s %-10s %-12s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2]; // 10 rows: weight, height

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] result = processTeam(hw);
        display(result);
    }
}
