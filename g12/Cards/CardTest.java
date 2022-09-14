package Cards;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card(3, "Hearts");
        Card c2 = new Card(7, "Spades");
        Card c3 = new Card(11, "Diamonds");
        Card c4 = new Card(5, "Clubs");

        c3.flip();

        Card[] cardsnsuch = { c1, c2, c3, c4 };

        for (Card card : cardsnsuch) {
            System.out.println(card.toString());
            /*
             * System.out.println(
             * "Card #" + card.getValue() + " Suite: " + card.getSuit() + " Is flipped? "
             * + (card.isFaceUp() ? "\033[1;32mYes\033[0m" : "\033[1;31mNo\033[0m"));
             */
        }
    }
}
