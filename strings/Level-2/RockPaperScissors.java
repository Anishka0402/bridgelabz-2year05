import java.util.Scanner;

public class RockPaperScissors {
    public static String playRound(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userWins = 0, compWins = 0, draws = 0;
        String[] choices = {"rock", "paper", "scissors"};

        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= rounds; i++) {
            System.out.print("\nRound " + i + " - Enter rock, paper or scissors: ");
            String user = sc.nextLine().toLowerCase();

            // computer choice
            int randomIndex = (int) (Math.random() * 3);
            String comp = choices[randomIndex];

            System.out.println("Computer chose: " + comp);

            String winner = playRound(user, comp);
            if (winner.equals("User")) {
                userWins++;
                System.out.println("You win this round!");
            } else if (winner.equals("Computer")) {
                compWins++;
                System.out.println("Computer wins this round!");
            } else {
                draws++;
                System.out.println("This round is a draw!");
            }
        }

        System.out.println("\n--- Game Stats ---");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);

        if (userWins > compWins) System.out.println("🏆 You are the overall winner!");
        else if (compWins > userWins) System.out.println("💻 Computer is the overall winner!");
        else System.out.println("🤝 It's a tie!");
    }
}
