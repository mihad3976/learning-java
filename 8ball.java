import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class eightball {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ballVal = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    System.out.println("\033[0;36mAsk the magic 8 program\033[0m");
    String userQuestion = input.nextLine();

    if (userQuestion instanceof String) {
      input.close();
      switch (ballVal) {
        case 1:
          {
            System.out.println("\033[0;32mSigns point to yes.\033[0m");
            break;
          }
        case 2:
          {
            System.out.println("\033[0;32mYes definitely.\033[0m");
            break;
          }
        case 3:
          {
            System.out.println("\033[0;31mDon't count on it.\033[0m");
            break;
          }
        case 4:
          {
            System.out.println("\033[0;33mConcentrate and ask again.\033[0m");
            break;
          }
        case 5:
          {
            System.out.println("\033[0;33mBetter not tell you now.\033[0m");
            break;
          }
        case 6:
          {
            System.out.println("\033[0;31mOutlook not so good.\033[0m");
            break;
          }
      }
    }
  }
}
