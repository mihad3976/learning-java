import java.util.Scanner;

public class methods {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(
      "\033[0;36mPlease select your option\n\033[0;32m1\033[0m - Find the value of a number squared\n\033[0;32m2\033[0m - Find the value of a number cubed\n\033[0;32m3\033[0m - Find the value of a number, to any power\n\033[0;32m4\033[0m - Find the value of a number plus another number\n\033[0;32m5\033[0m - Find the value of a number minus another number\n\033[0;32m6\033[0m - Find the value of a number multiplied by another number\n\033[0;32m7\033[0m - Find the value of a number divided another number\n\033[0;32m8\033[0m - Find the value of a number plus number plus another number\n\033[0;32m9\033[0m - exit\033[0;33m"
    );
    int userOption = input.nextInt();

    switch (userOption) {
      case 1:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number squared.\nPlease enter a number you wish to square\033[0;33m"
          );
          int userNumber = input.nextInt();
          System.out.println("\033[0;32m" + userNumber + "\033[0m squared is \033[0;32m" + square(userNumber));
          input.close();
          break;
        }
      case 2:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number cubed.\nPlease enter a number you wish to cube\033[0;33m"
          );
          int userNumber = input.nextInt();
          System.out.println("\033[0;32m" + userNumber + "\033[0m cubed is \033[0;32m" + cube(userNumber));
          input.close();
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

          System.out.println(
            "\033[0;32m" +
            userNumber +
            "\033[0m to the power of \033[0;32m" +
            userPower +
            "\033[0m is \033[0;32m" +
            cubeByNumber(userNumber, userPower)
          );
          input.close();
          break;
        }
      case 4:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number plus another number.\nPlease enter a number\033[0;33m"
          );
          int userNumberOne = input.nextInt();
          System.out.println("\033[0;36mPlease enter a number \033[0;33m");
          int userNumberTwo = input.nextInt();
          System.out.println(
            "\033[0;32m" +
            userNumberOne +
            "\033[0m plus \033[0;32m" +
            userNumberTwo +
            "\033[0m is \033[0;32m" +
            add(userNumberOne, userNumberTwo)
          );
          input.close();
          break;
        }
      case 5:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number minus another number.\nPlease enter a number\033[0;33m"
          );
          int userNumberOne = input.nextInt();
          System.out.println("\033[0;36mPlease enter a number \033[0;33m");
          int userNumberTwo = input.nextInt();
          System.out.println(
            "\033[0;32m" +
            userNumberOne +
            "\033[0m plus \033[0;32m" +
            userNumberTwo +
            "\033[0m is \033[0;32m" +
            minus(userNumberOne, userNumberTwo)
          );
          input.close();
          break;
        }
      case 6:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number multiplied by another number.\nPlease enter a number\033[0;33m"
          );
          int userNumberOne = input.nextInt();
          System.out.println("\033[0;36mPlease enter a number \033[0;33m");
          int userNumberTwo = input.nextInt();
          System.out.println(
            "\033[0;32m" +
            userNumberOne +
            "\033[0m multiplied by \033[0;32m" +
            userNumberTwo +
            "\033[0m is \033[0;32m" +
            multiply(userNumberOne, userNumberTwo)
          );
          input.close();
          break;
        }
      case 7:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number divided by another number.\nPlease enter a number\033[0;33m"
          );
          int userNumberOne = input.nextInt();
          System.out.println("\033[0;36mPlease enter a number \033[0;33m");
          int userNumberTwo = input.nextInt();
          System.out.println(
            "\033[0;32m" +
            userNumberOne +
            "\033[0m divided by \033[0;32m" +
            userNumberTwo +
            "\033[0m is \033[0;32m" +
            divide(userNumberOne, userNumberTwo)
          );
          input.close();
          break;
        }
      case 8:
        {
          System.out.println(
            "\033[0;36mYou have selected to find the value of a number plus number plus another number.\nPlease enter a number\033[0;33m"
          );
          int userNumberOne = input.nextInt();
          System.out.println("\033[0;36mPlease enter a number \033[0;33m");
          int userNumberTwo = input.nextInt();
          System.out.println("\033[0;36mPlease enter a number \033[0;33m");
          int userNumberThree = input.nextInt();
          System.out.println(
            "\033[0;32m" +
            userNumberOne +
            "\033[0m plus \033[0;32m" +
            userNumberTwo +
            "\033[0m plus \033[0;32m" +
            userNumberThree +
            "\033[0m is \033[0;32m" +
            addAdd(userNumberOne, userNumberTwo, userNumberThree)
          );
          input.close();
          break;
        }
      case 9:
        {
          input.close();
          System.out.println("\033[0;36mGoodbye!\033[0m");
          return;
        }
    }
  }

  public static int square(int userNumber) {
    int nNumber = userNumber * userNumber;
    return nNumber;
  }

  public static int cube(int userNumber) {
    int nNumber = userNumber * userNumber * userNumber;
    return nNumber;
  }

  public static int cubeByNumber(int userNumber, int userPower) {
    int newNumber = 1;
    for (int i = 0; i < userPower; i++) {
      newNumber *= userNumber;
    }
    return newNumber;
  }

  public static int add(int userNumberOne, int userNumberTwo) {
    return (userNumberOne + userNumberTwo);
  }

  public static int minus(int userNumberOne, int userNumberTwo) {
    return (userNumberOne - userNumberTwo);
  }

  public static int multiply(int userNumberOne, int userNumberTwo) {
    return (userNumberOne * userNumberTwo);
  }

  public static int divide(int userNumberOne, int userNumberTwo) {
    return (userNumberOne / userNumberTwo);
  }

  public static int addAdd(int userNumberOne, int userNumberTwo, int userNumberThree) {
    return (userNumberOne + userNumberTwo + userNumberThree);
  }
}
/* 
This project should use subroutines for as many tasks as possible.
Consider creating subroutines to output the user menu, to obtain data from the user, to output the solutions to the calculations, etc.
You should use methods to complete the calculations, and each subroutine will return data back to the main program, rather than output the data itself.
You should now include at least 8 mathematics calculation optionos for the user to select.
You can use some of the previous options listed earlier -OR- you can make new ones. 

\033[0;36mPlease select your option\n
\033[0;32m1\033[0m - Find the value of a number squared\n
\033[0;32m2\033[0m - Find the value of a number cubed\n
\033[0;32m3\033[0m - Find the value of a number, to any power\n
\033[0;32m4\033[0m - Find the value of a number plus another number\n
\033[0;32m5\033[0m - Find the value of a number minus another number\n
\033[0;32m6\033[0m - Find the value of a number multiplied by another number\n
\033[0;32m7\033[0m - Find the value of a number divided another number\n
\033[0;32m8\033[0m - Find the value of a number plus number plus another number\n
\033[0;32m9\033[0m - exit\033[0;33m
*/
