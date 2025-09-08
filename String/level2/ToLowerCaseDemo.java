import java.util.Scanner;

class RockPaperScissorsGame {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors") ||
            user.equals("paper") && comp.equals("rock") ||
            user.equals("scissors") && comp.equals("paper"))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, games;
        System.out.print("Enter number of games: ");
        games = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);

            System.out.println("Computer chose: " + comp);
            System.out.println("Winner: " + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (userWins * 100.0 / games));
        System.out.println("Computer Win %: " + (compWins * 100.0 / games));
    }
}
