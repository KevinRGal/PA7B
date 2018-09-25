import java.util.Scanner;

public class ProblemaSecuencial8 {
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
  System.out.println("Ingrese la altura de la alberca: ");
  double A = input.nextDouble();
  System.out.println("Ingrese el largo de de la alberca: ");
  double L = input.nextDouble();
  System.out.println("Ingrese el ancho de la alberca: ");
  double N = input.nextDouble();
  System.out.println("Ingrese el costo por metro cúbico: ");
  double CM = input.nextDouble();

  double V = A*L*N;
  double PAG = V*CM;

  System.out.println("El pago a realizar por el consumo es de: $" + PAG);

  }
}
