import java.util.Scanner;

public class averagecalc {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\033[0;36mPlease enter your first class mark (Numberical Grade Only)\033[0;33m");
    int userClass1 = input.nextInt();
    System.out.println("\033[0;36mPlease enter your second class mark (Numberical Grade Only)\033[0;33m");
    int userClass2 = input.nextInt();
    System.out.println("\033[0;36mPlease enter your third class mark (Numberical Grade Only)\033[0;33m");
    int userClass3 = input.nextInt();
    System.out.println("\033[0;36mPlease enter your fourth class mark (Numberical Grade Only)\033[0;33m");
    int userClass4 = input.nextInt();

    int[] userClasses = { userClass1, userClass2, userClass3, userClass4 };
    input.close();

    float res = 0;

    for (int i = 0; i < 4; i++) {
      res += userClasses[i];
    }

    System.out.println(
      "\033[0mYour class average is \033[0;32m" + (double) Math.round((res / 4) * 10.0) / 10.0 + "\033[0m"
    );
  }
}
