import java.util.Scanner;

public class ProblemaSecuencial7 {
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
  System.out.println("Ingrese la cantidad de metros requeridos: ");
  double CM = input.nextDouble();
  double PG = CM/0.0254;
  System.out.println("La cantidad de tela en pulgadas que debe pedir es: " + PG);

  }
}
