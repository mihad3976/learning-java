package Cards;

public class Card {
    // Instance vars, always private ("security" and such)
    private String suit;
    private int value;
    private boolean isUp;

    // Constructor, init the vars
    public Card(int value, String suite) {
        this.value = value;
        this.suit = suite;
        this.isUp = false;
    }

    // Getters Start
    public int getValue() {
        return this.value;
    }

    public String getSuit() {
        return this.suit;
    }

    public boolean isFaceUp() {
        return this.isUp;
    }
    // Getters End

    // Setters Start
    public void flip() {
        this.isUp = !this.isUp;
    }
    // Setters End

    public String toString() {
        String cardText = "";
        switch (this.value) {
            case 1: {
                cardText = "Ace";
                break;
            }
            case 11: {
                cardText = "Jack";
                break;
            }
            case 12: {
                cardText = "Queen";
                break;
            }
            case 13: {
                cardText = "King";
                break;
            }
            default: {
                cardText = "" + this.value;
                break;
            }
        }
        return (this.isFaceUp() ? cardText + " of " + this.suit : "\033[1;31mCard is faced down.\033[0m");
    }
}