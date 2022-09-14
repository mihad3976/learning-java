package Cards;

public class Deck {

    private Card[] cards = new Card[52];
    private int cardsLeft;
    // private boolean isShuffled = false;

    public Deck() {
        this.cardsLeft = 0;

        this.makeSuite("Hearts");
        this.makeSuite("Clubs");
        this.makeSuite("Spades");
        this.makeSuite("Diamonds");
    }

    private void makeSuite(String suit) {
        for (int i = 1; i < 13; i++) {
            Card c = new Card(i, suit);
            this.cards[this.cardsLeft] = c;
            this.cardsLeft++;
        }
    }
}