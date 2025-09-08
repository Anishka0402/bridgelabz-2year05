package String.level3;  
import java.util.*;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for(String s: suits)
            for(String r: ranks)
                deck[index++] = r + " of " + s;
        return deck;
    }

    public static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length-i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static void distribute(String[] deck, int players, int cards) {
        if(players*cards > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return;
        }
        for(int i=0; i<players; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for(int j=0; j<cards; j++) {
                System.out.print(deck[i*cards+j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffle(deck);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards each: ");
        int cards = sc.nextInt();
        distribute(deck, players, cards);
    }
}
