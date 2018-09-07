import java.util.Scanner;

public class ProblemaSecuencial3 {
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
  System.out.println("Inserte la base del triángulo y del rectángulo: ");
  double B = input.nextDouble();

  System.out.println("Inserte la altura del triángulo y del rectángulo unidos: ");
  double A = input.nextDouble();

  System.out.println("Inserte la altura del rectángulo: ");
  double C = input.nextDouble();

  double AT = (B * (A-C))/2;
  double AR = B * C;
  double area = AT + AR;

System.out.println("El área del triángulo es: " + AT);
System.out.println("El área del rectángulo es: " + AR);
System.out.println("El área del terreno es: " + area);

  }
}
