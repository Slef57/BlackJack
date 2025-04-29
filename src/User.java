class User extends Player {

    public User() throws InterruptedException {
        printS("Enter your name: ");
        name = scanner.nextLine();
    }

    @Override
    public void draw(Deck deck) throws InterruptedException {
        if (deck.isEmpty()) {
            deck.reshuffle();
            printS("The deck has been reshuffled.");
        }

        this.hand.add(deck.getDeck().get(0));
        deck.getDeck().remove(0);
        if (this.hand.get(this.hand.size() - 1).getValue() == 1) {
            printS("You drew an Ace! Would you like it to be worth 1 or 11?");
            int value = scanner.nextInt();
            while (value != 1 && value != 11) {
                printS("Invalid input. Please enter 1 or 11.");
                value = scanner.nextInt();
            }
            this.hand.get(this.hand.size() - 1).setValue(value);
        }
    }

    @Override
    public void bet() throws InterruptedException {
        printS("Enter your bet: ");
        while (!scanner.hasNextDouble()) {
            printS("Invalid input. Please enter a valid number for your bet: X,X where X is a number.");
            scanner.next(); // Clear the invalid input
        }
        double bet = scanner.nextDouble();

        if (bet > budget) {
            printS("You do not have enough money to make that bet.");
            bet();
        } else if (bet < 0) {
            printS("You cannot bet a negative amount.");
            bet();
        } else if (bet == 0) {
            printS("You must bet something.");
            bet();
        }
        else {
            this.bet = bet;
            budget -= bet;
        }
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
