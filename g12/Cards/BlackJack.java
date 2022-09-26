package Cards;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Hand player = new Hand();
        Hand dealer = new Hand();

        player.addCard(deck.dealACard());
        player.addCard(deck.dealACard());
        dealer.addCard(deck.dealACard());

        int playerTotal = player.countTotal();
        int dealerTotal = dealer.countTotal();

        System.out.println("Player Cards ");
        player.printCards();
        System.out.println("Player Total: " + playerTotal);

        System.out.println("Dealer Cards ");
        dealer.printCards();
        System.out.println("Player Total: " + dealerTotal);

        int option = 0;
        Scanner input = new Scanner(System.in);
        while (option != 1) {
            System.out.println("x");
        }
        input.close();

    }
}
