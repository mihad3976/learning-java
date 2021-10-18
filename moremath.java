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
        }
      case 3:
        {}
      case 4:
        {
          input.close();
          System.out.println("\033[0;36mGoodbye!\033[0m");
          return;
        }
    }
  }
}
