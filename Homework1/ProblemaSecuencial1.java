import java.util.Scanner;

public class ProblemaSecuencial1 {
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
  System.out.println("Inserte la base del rectangulo: ");
  double a = input.nextDouble();

  System.out.println("Inserte la altura del rectangulo: ");
  double b = input.nextDouble();

  double area = a * b;

  System.out.println("El área del rectangulo es: " + area);
  }

}
