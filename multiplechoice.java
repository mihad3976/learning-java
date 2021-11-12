import java.util.Scanner;

public class multiplechoice {

  public static int[] userData = { 0, 0, 0 }; // [0] = Correct Answers, [1] = Incorrect Answers, [2] = Overall %

  public static void main(String[] args) {
    quiz();
  }

  public static void quiz() {
    Scanner input = new Scanner(System.in);
    System.out.println(
      "\033[0;36mWelcome to the Java Quiz, a simple 5 question quiz.\n\033[0;32m0\033[0m - Start Quiz\n\033[0;32m1\033[0m - Exit Quiz\033[0;33m"
    );
    int userOption = input.nextInt();

    if (userOption == 1) {
      input.close();
      return;
    } else {
      System.out.println(
        "\033[0;36mQuestion 1: How do you import a scanner?\n\033[0;32m0\033[0m - import java.Scanner;\n\033[0;32m1\033[0m - import scanner;\n\033[0;32m2\033[0m - import util.Scanner;\n\033[0;32m3\033[0m - import java.util.Scanner;\033[0;33m"
      );
      int userQuestionOne = input.nextInt();
      if (userQuestionOne != 3) {
        userData[1] += 1;
      } else {
        userData[0] += 1;
      }

      System.out.println(
        "\033[0;36mQuestion 2: What is the correct statement?\n\033[0;32m0\033[0m - Scanner input = new Scanner(System.in);\n\033[0;32m1\033[0m - Scanner input = new Scanner(System.out);\n\033[0;32m2\033[0m - Scanner input = new Scanner();\n\033[0;32m3\033[0m - Scanner input = Scanner();\033[0;33m"
      );
      int userQuestionTwo = input.nextInt();
      if (userQuestionTwo != 0) {
        userData[1] += 1;
      } else {
        userData[0] += 1;
      }

      System.out.println(
        "\033[0;36mQuestion 3: How do you print to the terminal?\n\033[0;32m0\033[0m - System.print();\n\033[0;32m1\033[0m - System.out.println();\n\033[0;32m2\033[0m - System.in.print();\n\033[0;32m3\033[0m - console.log();\033[0;33m"
      );
      int userQuestionThree = input.nextInt();
      if (userQuestionThree != 1) {
        userData[1] += 1;
      } else {
        userData[0] += 1;
      }

      System.out.println(
        "\033[0;36mQuestion 4: How do you find the fith index of an array?\n\033[0;32m0\033[0m - array[5]\n\033[0;32m1\033[0m - [5]array\n\033[0;32m2\033[0m - array.five\033[0;33m"
      );
      int userQuestionFour = input.nextInt();
      if (userQuestionFour != 0) {
        userData[1] += 1;
      } else {
        userData[0] += 1;
      }

      System.out.println(
        "\033[0;36mQuestion 5: How should you declare a public string that should not change?\n\033[0;32m0\033[0m - public static final String\n\033[0;32m1\033[0m - public static String\n\033[0;32m2\033[0m - public static String\n\033[0;32m3\033[0m - public final String\033[0;33m"
      );
      int userQuestionFive = input.nextInt();
      if (userQuestionFive != 0) {
        userData[1] += 1;
        input.close();
        calcVals();
      } else {
        userData[0] += 1;
        input.close();
        calcVals();
      }
    }
  }

  public static void calcVals() {
    int percentage = (int) Math.round(100.0 / 5 * userData[0]);
    userData[2] = percentage;
    if (percentage >= 50) {
      pass();
    } else {
      fail();
    }
  }

  public static void fail() {
    System.out.println(
      "\033[0mYou have \033[1;31mfailed\033[0m with a grade of \033[0;32m" +
      userData[2] +
      "%\033[0m. \033[0;32m" +
      userData[0] +
      "\033[0m Correct and \033[0;32m" +
      userData[1] +
      "\033[0m Incorrect"
    );
    userData[0] = 0;
    userData[1] = 0;
    userData[2] = 0;
  }

  public static void pass() {
    System.out.println(
      "\033[0mYou have \033[1;32mpassed\033[0m with a grade of \033[0;32m" +
      userData[2] +
      "%\033[0m. \033[0;32m" +
      userData[0] +
      "\033[0m Correct and \033[0;32m" +
      userData[1] +
      "\033[0m Incorrect"
    );
    userData[0] = 0;
    userData[1] = 0;
    userData[2] = 0;
  }
}
