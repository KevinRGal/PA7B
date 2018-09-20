import java.util.Scanner;

public class PositivoNegativo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inser the number.");
      int NUM = input.nextInt();
  String R;
    if (NUM < 0)
      R = "NEGATIVE";
    else {
      R = "POSITIVE";
    }
    System.out.println("The number is " + R);
  }
}
