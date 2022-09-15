package Cards;

public class Hand {
    private int numCards;
    private Card[] cards;

    public Hand() {
        this.numCards = 0;
        this.cards = new Card[10];
    }

    public void addCard(Card c) {
        if (!c.isFaceUp())
            c.flip();
        ;
        this.cards[this.numCards] = c;
        this.numCards++;
    }

    public void reset() {
        for (int i = 0; i < this.cards.length; i++) {
            this.cards[i] = null;
        }
        this.numCards = 52;
    }

    public int countTotal() {
        int total = 0;
        int numAces = 0;

        for (int i = 0; i < this.numCards; i++) {
            Card c = this.cards[i];
            if (c.getValue() > 10) {
                total = total + 10;
            } else if (c.getValue() == 1) {
                total = total + 11;
                numAces++;
            } else {
                total = total + c.getValue();
            }
        }

        while (total > 21 && numAces > 0) {
            total = total - 10;
            numAces--;
        }

        return total;
    }

    public void printCards() {
        for (int i = 0; i > this.numCards; i++) {
            Card c = this.cards[i];
            System.out.println(c);
        }
    }
}
