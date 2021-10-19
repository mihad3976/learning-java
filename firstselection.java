import java.util.Scanner;

class firstselection {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\033[0;36mPlease enter the amount spent\033[0;33m");
    double userInput = input.nextDouble();

    if (userInput > 0.01 && userInput < 40.00) {
      input.close();
      double saves = (double) Math.round((userInput * (10 / 100.0f)) * 100.0) / 100.0;
      System.out.println(
        "\033[0mYou have spent \033[0;32m$" +
        userInput +
        "\033[0m, but you saved \033[0;32m10%\033[0m or \033[0;32m$" +
        saves +
        "\033[0m!\nYour new total is \033[0;32m$" +
        (Math.round((userInput - saves) * 100.0) / 100.0)
      );
    } else if (userInput > 40.01 && userInput < 80.00) {
      input.close();
      double saves = (double) Math.round((userInput * (20 / 100.0f)) * 100.0) / 100.0;
      System.out.println(
        "\033[0mYou have spent \033[0;32m$" +
        userInput +
        "\033[0m, but you saved \033[0;32m20%\033[0m or \033[0;32m$" +
        saves +
        "\033[0m!\nYour new total is \033[0;32m$" +
        (Math.round((userInput - saves) * 100.0) / 100.0)
      );
    } else if (userInput > 80.01 && userInput < 120.00) {
      input.close();
      double saves = (double) Math.round((userInput * (30 / 100.0f)) * 100.0) / 100.0;
      System.out.println(
        "\033[0mYou have spent \033[0;32m$" +
        userInput +
        "\033[0m, but you saved \033[0;32m30%\033[0m or \033[0;32m$" +
        saves +
        "\033[0m!\nYour new total is \033[0;32m$" +
        (Math.round((userInput - saves) * 100.0) / 100.0)
      );
    } else if (userInput > 120.01) {
      input.close();
      double saves = (double) Math.round((userInput * (40 / 100.0f)) * 100.0) / 100.0;
      System.out.println(
        "\033[0mYou have spent \033[0;32m$" +
        userInput +
        "\033[0m, but you saved \033[0;32m40%\033[0m or \033[0;32m$" +
        saves +
        "\033[0m!\nYour new total is \033[0;32m$" +
        (Math.round((userInput - saves) * 100.0) / 100.0)
      );
    } else {
      input.close();
      System.out.println("\033[0;31mThere was an error!\033[0m");
    }
  }
}
