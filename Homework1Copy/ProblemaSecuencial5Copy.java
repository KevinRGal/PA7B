import java.util.Scanner;

public class ProblemaSecuencial5 {
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
  System.out.println("Inserte el cantidad de litros producidos: ");
  int L = input.nextInt();

  System.out.println("Inserte el precio por galón: ");
  double PG = input.nextDouble();
  double TG = L*3.785;
  double GA = TG*PG;

  System.out.println("Cantidad de galones producida: " + TG);
  System.out.println("Ganancia por la entrega de leche: " + GA);

  }
}
