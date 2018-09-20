import java.util.Scanner;

public class ElHarapientoDistinguido {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insert cost of the suit.");
    double CT = input.nextDouble();
    Double DE;
    if (CT < 2500)
        DE = CT * .08;
    else {
      DE = CT * .15;
    }
    Double PF = CT - DE;
    System.out.println("Final price of suit: " + PF + "\nDiscount of: " + DE);
  }
}
