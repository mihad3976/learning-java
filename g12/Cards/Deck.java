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

    public int getNumCardsLeft() {
        return this.cardsLeft;
    }

    public Card dealACard() {
        this.cardsLeft--;
        return this.cards[this.cardsLeft];
    }

    public void shuffle() {
        for (int i = 0; i < this.cardsLeft; i++) {
            // get the swap spot
            int spot = (int) (Math.random() * (this.cardsLeft - i) + i);
            // save the Card in one position
            Card temp = this.cards[spot];
            this.cards[spot] = this.cards[i];
            this.cards[i] = temp;
        }
    }
}