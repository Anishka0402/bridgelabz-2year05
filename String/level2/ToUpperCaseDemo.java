import java.util.Scanner;

class StudentScoreCard {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + (int)(Math.random() * 60); // Physics
            scores[i][1] = 40 + (int)(Math.random() * 60); // Chemistry
            scores[i][2] = 40 + (int)(Math.random() * 60); // Maths
        }
        return scores;
    }

    public static String grade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 40) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);

        System.out.println("Phy\tChem\tMath\tTotal\t% \tGrade");
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double percent = Math.round((total / 3.0) * 100.0) / 100.0;
            String g = grade(percent);

            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                               total + "\t" + percent + "\t" + g);
        }
    }
}
