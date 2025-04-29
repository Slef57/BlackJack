class Dealer extends Player {

    public Dealer() {
        budget = 1000000000;
        name = "House";
    }

    @Override
    public void draw(Deck deck) throws InterruptedException{
        if (deck.isEmpty()) {
            deck.reshuffle();
            printS("Deck has been reshuffled.");
        }

        this.hand.add(deck.getDeck().get(0));
        deck.getDeck().remove(0);
        if (this.hand.get(this.hand.size() - 1).getValue() == 1) {
            this.hand.get(this.hand.size() - 1).setValue(11);
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