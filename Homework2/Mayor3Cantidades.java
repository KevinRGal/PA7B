import java.util.Scanner;

public class Mayor3Cantidades {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first number");
    double A = input.nextInt();

    System.out.println("Enter the second number");
    double B = input.nextInt();

    System.out.println("Enter the third number");
    double C = input.nextInt();
    double M;
    if (A > B && A > C) {
      M = A;
    } else if (B > C && C > B) {
      M = B;

    } else {
      M = C;
    }
    System.out.println(M + " is major.");
  }

}
