import java.util.Scanner;

public class PuebloDesconocido  {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your card type: ");
    int TT = input.nextInt(); //Tipo tarjeta

    System.out.println("Enter your current credit limit");
    double LA = input.nextDouble(); //Limite actual de credito
    double AC; //Aumento de crédito
if (TT == 1)
AC = LA * .25;
else if (TT == 2)
AC = LA * .35;
else if (TT == 3)
AC = LA * .40;
else
AC = LA * .50;

double NC = LA + AC; // Nuevo límite de crédito
System.out.println("You credit increse is: " + AC);
System.out.println("Your new credit limit is: " + NC);

  }
}
