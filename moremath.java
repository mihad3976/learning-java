import java.util.Scanner;

public class moremath {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(
      "\033[0;36mPlease select your option\n\033[0;32m1\033[0m - Find the value of a number squared\n\033[0;32m2\033[0m - Find the value of a number cubed\n\033[0;32m3\033[0m - Find the value of a number, to any power\n\033[0;32m4\033[0m - exit\033[0;33m"
    );
    int userOption = input.nextInt();

    switch (userOption) {
      case 1:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number squared.\nPlease enter a number you wish to square\033[0;33m"
          );
          int userNumber = input.nextInt();
          input.close();
          int nNumber = userNumber * userNumber;
          System.out.println("\033[0;32m" + userNumber + "\033[0m squared is \033[0;32m" + nNumber);
          break;
        }
      case 2:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number cubed.\nPlease enter a number you wish to cube\033[0;33m"
          );
          int userNumber = input.nextInt();
          input.close();
          int nNumber = userNumber * userNumber * userNumber;
          System.out.println("\033[0;32m" + userNumber + "\033[0m cubed is \033[0;32m" + nNumber);
          break;
        }
      case 3:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number with your own power.\nPlease enter a number\033[0;33m"
          );
          int userNumber = input.nextInt();
          System.out.println("\033[0;36mPlease enter a power\033[0;33m");
          int userPower = input.nextInt();
          int newNumber = 1;

          for (int i = 0; i < userPower; i++) {
            newNumber *= userNumber;
          }

          System.out.println(
            "\033[0;32m" +
            userNumber +
            "\033[0m to the power of \033[0;32m" +
            userPower +
            "\033[0m is \033[0;32m" +
            newNumber
          );
          break;
        }
      case 4:
        {
          input.close();
          System.out.println("\033[0;36mGoodbye!\033[0m");
          return;
        }
    }
  }
}
