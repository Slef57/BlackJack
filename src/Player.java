import java.util.ArrayList;
import java.util.Scanner;

class Player {
    ArrayList<card> hand;
    double budget;
    double bet;
    String name;

    Scanner scanner = new Scanner(System.in);

    public Player() {
        hand = new ArrayList<card>();
        budget = 100;
        bet = 0;
    }

    public ArrayList<card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<card> hand) {
        this.hand = hand;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void draw(Deck deck) throws InterruptedException {}

    public void bet() throws InterruptedException {}

    public void printHand() throws InterruptedException {
        printS(this.getName() + "'s hand:");
        int handValue = 0;
        for (int i = 0; i < hand.size(); i++) {
            printS(hand.get(i).getSuit() + " of " + hand.get(i).getRank());
            handValue += hand.get(i).getValue();
        }
        printS("Hand value: " + handValue + "\n");
    }

    public void printBudget() throws InterruptedException {
        printS(this.getName() + "'s budget: " + budget);
    }

    public static void printS(String message) throws InterruptedException {
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            System.out.print(ch);
            Thread.sleep(0); // Sleep 100ms (0.1 seconds)
        }
        System.out.println();
    }
}
