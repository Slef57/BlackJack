import java.util.Scanner;

class Game {

    User user;
    Dealer house;
    Deck deck;

    Scanner scanner = new Scanner(System.in);

    public Game() throws InterruptedException{
        user = new User();
        house = new Dealer();
        deck = new Deck();
        deck.initial();
        deck.shuffle();
        printS("Welcome to BlackJack!");
        round();
        printS("Would you like to play another round? (y/n)");
        String answer;
        do {
            if (user.getBudget() == 0) {
                printS("You are out of money! Game over.");
                return;
            }
            answer = scanner.next();
            if (!(answer.equals("y") || answer.equals("n")))
                printS("Invalid input. Please enter 'y' or 'n'");
            else if (answer.equals("y")) {
                round();
                printS("Would you like to play another round? (y/n)");
            }
        } while (answer.equals("y") || !answer.equals("n"));
        printS(user.getName() + "'s budget: " + user.getBudget());
    }

    public void round() throws InterruptedException {
        printS("Round Start!");
        printS(user.getName() + "'s turn:");
        printS("Budget: " + user.getBudget());

        user.bet();

        printS(user.getName() + " draws ");
        user.draw(deck);
        user.printHand();

        printS(house.getName() + " draws ");
        house.draw(deck);
        house.printHand();

        printS(user.getName() + " draws ");
        user.draw(deck);
        user.printHand();

        printS(house.getName() + " draws ");
        house.draw(deck);

        if (checkBust(user))  {
            endRound();
            return;
        }

        if (checkBlackJack(user))  {
            endRound();
            return;
        }

        System.out.println();

        printS("Would you like to draw another card? (y/n)");
        String answer;
        do {
            answer = scanner.next();
            if (!(answer.equals("y") || answer.equals("n")))
                printS("Invalid input. Please enter 'y' or 'n'");
            else if (answer.equals("y")) {
                printS(user.getName() + " draws ");
                user.draw(deck);
                user.printHand();
                if (checkBust(user)) {
                    endRound();
                    return;
                }
                if (checkBlackJack(user)) {
                    endRound();
                    return;
                }
                printS("Would you like to draw another card? (y/n)");
            }
        } while (answer.equals("y") || !answer.equals("n"));

        house.printHand();

        while (getHandValue(house) < 17) {
            printS(house.getName() + " draws ");
            house.draw(deck);
            house.printHand();
            if (checkBust(house)) {
                user.budget += user.bet * 2;
                endRound();
                return;
            }
        }

//      System.out.println("Deck is empty. Reshuffling deck.");
//      deck.reshuffle();

        if (getHandValue(user) > getHandValue(house)) {
            printS(user.getName() + " wins!");
            user.budget += user.bet + (user.bet * 2);
            user.bet = 0;
            endRound();
            return;
        } else if (getHandValue(user) < getHandValue(house)) {
            printS(house.getName() + " wins!");
            user.bet = 0;
            endRound();
            return;
        } else {
            printS("Draw!");
            user.budget += user.bet;
            user.bet = 0;
            endRound();
            return;
        }
    }

    public int getHandValue (Player p){
        int handValue = 0;
        for (int i = 0; i < p.hand.size(); i++)
            handValue += p.hand.get(i).getValue();
        return handValue;
    }

    public void discardHand (Player p){
        for (int i = 0; i < p.hand.size(); i++) {
            Deck.discard.add(p.hand.get(i));
            p.hand.remove(i);
        }
    }

    public boolean checkBlackJack (Player p) throws InterruptedException {
        if (this.getHandValue(p) == 21) {
            printS(user.getName() + " BlackJack!");
            p.budget += p.bet + (p.bet * 1.5);
            p.printBudget();
            p.bet = 0;
            return true;
        }
        return false;
    }

    public boolean checkBust (Player p) throws InterruptedException {
        if (this.getHandValue(p) > 21) {
            for (int i = 0; i < p.hand.size(); i++)
                if (p.hand.get(i).getValue() == 11) {
                    printS("The value of " + p.getName() + "'s Ace changed to 1");
                    p.hand.get(i).setValue(1);
                }
            p.printHand();
            if (this.getHandValue(p) > 21) {
                printS(p.getName() + " Bust!");
                //house.setBudget(p.getBudget() + p.bet);
                p.bet = 0;
                return true;
            }
        }
        return false;
    }

    public void endRound () throws InterruptedException {
        printS("round end");
        printS(user.getName() + "'s budget:" + user.getBudget());
        deck.discardHand(user);
        deck.discardHand(house);
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