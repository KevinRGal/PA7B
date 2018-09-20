import java.util.Scanner;

public class Lapices {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inser number of pencils.");
    int X = input.nextInt();
    double PAG;
    if (X < 1000)
    PAG = (X * .90);
    else {
      PAG = (X * .85);
    }
    System.out.println("The payment for the pencils is: " + PAG);
  }
}
