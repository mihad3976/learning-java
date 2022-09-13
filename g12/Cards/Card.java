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

}