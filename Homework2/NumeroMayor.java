import java.util.Scanner;

public class NumeroMayor {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int M;
    System.out.println("Insert the fist number.");
    int A = input.nextInt();

    System.out.println("Insert the second number.");
    int B = input.nextInt();

    if (A > B) {
      M = A;
      System.out.println( M + "is the major");
    } else if (B > A) {
      M = B;
      System.out.println( M + " is the major");
    } else { System.out.println("The numbers are iqual."); }
  }
}
