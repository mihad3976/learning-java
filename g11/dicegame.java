import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class diceGame {

  public static void main(String[] args) {
    roller();
  }

  private static void roller() {
    Scanner input = new Scanner(System.in);
    int diceVal = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    System.out.println(
      "A dice has been rolled, What number do you think it landed on? \033[0;34m(1-6)\033[0m" +
      "\nIf you wish to stop playing, type \033[0;34m0\033[0m"
    );
    int selection = input.nextInt();

    if (selection == 0) {
      input.close();
      return;
    } else {
      if (selection == diceVal) {
        System.out.println("Correct number! The rolled number was: \033[0;34m" + diceVal + "\033[0m!");
        input.close();
        roller();
      } else {
        System.out.println("Incorrect number! The rolled number was: \033[0;34m" + diceVal + "\033[0m!");
        input.close();
        roller();
      }
    }
  }
}
