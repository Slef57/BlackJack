import java.util.ArrayList;

class Deck {
    ArrayList<card> deck;
    static ArrayList<card> discard;

    public Deck() {
        deck = new ArrayList<card>(52);
        discard = new ArrayList<card>();
        for (int i = 0 ; i < 52 ; i++)
            deck.add(new card());
    }

    public ArrayList<card> getDeck() {
        return deck;
    }

    /*public void setDeck(ArrayList<card> deck) {
        this.deck = deck;
    }*/

    public ArrayList<card> getDiscard() {
        return discard;
    }

    /*public void setDiscard(ArrayList<card> discard) {
        this.discard = discard;
    }*/

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public void initial() {
        this.deck.get(0).setValue(1);
        this.deck.get(0).setSuit("Ace");
        this.deck.get(0).setRank("Hearts");

        this.deck.get(1).setValue(2);
        this.deck.get(1).setSuit("Two");
        this.deck.get(1).setRank("Hearts");

        this.deck.get(2).setValue(3);
        this.deck.get(2).setSuit("Three");
        this.deck.get(2).setRank("Hearts");

        this.deck.get(3).setValue(4);
        this.deck.get(3).setSuit("Four");
        this.deck.get(3).setRank("Hearts");

        this.deck.get(4).setValue(5);
        this.deck.get(4).setSuit("Five");
        this.deck.get(4).setRank("Hearts");

        this.deck.get(5).setValue(6);
        this.deck.get(5).setSuit("Six");
        this.deck.get(5).setRank("Hearts");

        this.deck.get(6).setValue(7);
        this.deck.get(6).setSuit("Seven");
        this.deck.get(6).setRank("Hearts");

        this.deck.get(7).setValue(8);
        this.deck.get(7).setSuit("Eight");
        this.deck.get(7).setRank("Hearts");

        this.deck.get(8).setValue(9);
        this.deck.get(8).setSuit("Nine");
        this.deck.get(8).setRank("Hearts");

        this.deck.get(9).setValue(10);
        this.deck.get(9).setSuit("Ten");
        this.deck.get(9).setRank("Hearts");

        this.deck.get(10).setValue(10);
        this.deck.get(10).setSuit("Jack");
        this.deck.get(10).setRank("Hearts");

        this.deck.get(11).setValue(10);
        this.deck.get(11).setSuit("Queen");
        this.deck.get(11).setRank("Hearts");

        this.deck.get(12).setValue(10);
        this.deck.get(12).setSuit("King");
        this.deck.get(12).setRank("Hearts");

        this.deck.get(13).setValue(1);
        this.deck.get(13).setSuit("Ace");
        this.deck.get(13).setRank("Clubs");

        this.deck.get(14).setValue(2);
        this.deck.get(14).setSuit("Two");
        this.deck.get(14).setRank("Clubs");

        this.deck.get(15).setValue(3);
        this.deck.get(15).setSuit("Three");
        this.deck.get(15).setRank("Clubs");

        this.deck.get(16).setValue(4);
        this.deck.get(16).setSuit("Four");
        this.deck.get(16).setRank("Clubs");

        this.deck.get(17).setValue(5);
        this.deck.get(17).setSuit("Five");
        this.deck.get(17).setRank("Clubs");

        this.deck.get(18).setValue(6);
        this.deck.get(18).setSuit("Six");
        this.deck.get(18).setRank("Clubs");

        this.deck.get(19).setValue(7);
        this.deck.get(19).setSuit("Seven");
        this.deck.get(19).setRank("Clubs");

        this.deck.get(20).setValue(8);
        this.deck.get(20).setSuit("Eight");
        this.deck.get(20).setRank("Clubs");

        this.deck.get(21).setValue(9);
        this.deck.get(21).setSuit("Nine");
        this.deck.get(21).setRank("Clubs");

        this.deck.get(22).setValue(10);
        this.deck.get(22).setSuit("Ten");
        this.deck.get(22).setRank("Clubs");

        this.deck.get(23).setValue(10);
        this.deck.get(23).setSuit("Jack");
        this.deck.get(23).setRank("Clubs");

        this.deck.get(24).setValue(10);
        this.deck.get(24).setSuit("Queen");
        this.deck.get(24).setRank("Clubs");

        this.deck.get(25).setValue(10);
        this.deck.get(25).setSuit("King");
        this.deck.get(25).setRank("Clubs");

        this.deck.get(26).setValue(1);
        this.deck.get(26).setSuit("Ace");
        this.deck.get(26).setRank("Diamonds");

        this.deck.get(27).setValue(2);
        this.deck.get(27).setSuit("Two");
        this.deck.get(27).setRank("Diamonds");

        this.deck.get(28).setValue(3);
        this.deck.get(28).setSuit("Three");
        this.deck.get(28).setRank("Diamonds");

        this.deck.get(29).setValue(4);
        this.deck.get(29).setSuit("Four");
        this.deck.get(29).setRank("Diamonds");

        this.deck.get(30).setValue(5);
        this.deck.get(30).setSuit("Five");
        this.deck.get(30).setRank("Diamonds");

        this.deck.get(31).setValue(6);
        this.deck.get(31).setSuit("Six");
        this.deck.get(31).setRank("Diamonds");

        this.deck.get(32).setValue(7);
        this.deck.get(32).setSuit("Seven");
        this.deck.get(32).setRank("Diamonds");

        this.deck.get(33).setValue(8);
        this.deck.get(33).setSuit("Eight");
        this.deck.get(33).setRank("Diamonds");

        this.deck.get(34).setValue(9);
        this.deck.get(34).setSuit("Nine");
        this.deck.get(34).setRank("Diamonds");

        this.deck.get(35).setValue(10);
        this.deck.get(35).setSuit("Ten");
        this.deck.get(35).setRank("Diamonds");

        this.deck.get(36).setValue(10);
        this.deck.get(36).setSuit("Jack");
        this.deck.get(36).setRank("Diamonds");

        this.deck.get(37).setValue(10);
        this.deck.get(37).setSuit("Queen");
        this.deck.get(37).setRank("Diamonds");

        this.deck.get(38).setValue(10);
        this.deck.get(38).setSuit("King");
        this.deck.get(38).setRank("Diamonds");

        this.deck.get(39).setValue(1);
        this.deck.get(39).setSuit("Ace");
        this.deck.get(39).setRank("Spades");

        this.deck.get(40).setValue(2);
        this.deck.get(40).setSuit("Two");
        this.deck.get(40).setRank("Spades");

        this.deck.get(41).setValue(3);
        this.deck.get(41).setSuit("Three");
        this.deck.get(41).setRank("Spades");

        this.deck.get(42).setValue(4);
        this.deck.get(42).setSuit("Four");
        this.deck.get(42).setRank("Spades");

        this.deck.get(43).setValue(5);
        this.deck.get(43).setSuit("Five");
        this.deck.get(43).setRank("Spades");

        this.deck.get(44).setValue(6);
        this.deck.get(44).setSuit("Six");
        this.deck.get(44).setRank("Spades");

        this.deck.get(45).setValue(7);
        this.deck.get(45).setSuit("Seven");
        this.deck.get(45).setRank("Spades");

        this.deck.get(46).setValue(8);
        this.deck.get(46).setSuit("Eight");
        this.deck.get(46).setRank("Spades");

        this.deck.get(47).setValue(9);
        this.deck.get(47).setSuit("Nine");
        this.deck.get(47).setRank("Spades");

        this.deck.get(48).setValue(10);
        this.deck.get(48).setSuit("Ten");
        this.deck.get(48).setRank("Spades");

        this.deck.get(49).setValue(10);
        this.deck.get(49).setSuit("Jack");
        this.deck.get(49).setRank("Spades");

        this.deck.get(50).setValue(10);
        this.deck.get(50).setSuit("Queen");
        this.deck.get(50).setRank("Spades");

        this.deck.get(51).setValue(10);
        this.deck.get(51).setSuit("King");
        this.deck.get(51).setRank("Spades");

    }

    public void shuffle() {
        for ( int i = 0 ; i < this.deck.size() ; i++ ) {
            int random = (int)(Math.random()*this.deck.size());
            card temp = this.deck.get(i);
            this.deck.set(i, this.deck.get(random));
            this.deck.set(random, temp);
        }
    }

    public void reshuffle() {
        for ( int i = 0 ; i < discard.size() ; i++ ) {
            this.deck.add(discard.get(i));
        }
        discard.clear();
        shuffle();
    }

    public void discardHand(Player p) {
        for (int i = 0; i < p.hand.size(); i++) {
            Deck.discard.add(p.hand.get(i));
        }
        p.hand.clear();
    }

    public void printDeck() { //Used for testing purposes
        for ( int i = 0 ; i < 52 ; i++ ) {
            System.out.println((i+1)+" Card: " + this.deck.get(i).getSuit() + " of " + this.deck.get(i).getRank() + " Card value: " + this.deck.get(i).getValue());
        }
    }

    public void printDiscard() { //Used for testing purposes
        for ( int i = 0 ; i < discard.size() ; i++ ) {
            System.out.println((i+1)+" Card: " + discard.get(i).getSuit() + " of " + discard.get(i).getRank() + " Card value: " + discard.get(i).getValue());
        }
    }
}