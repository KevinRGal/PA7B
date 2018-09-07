import java.util.Scanner;

public class ProblemaSecuencial2 {
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
  System.out.println("Inserte el rádio de la circunferencia: ");
  double R = input.nextDouble();

  double PI = 3.1416;

  double area = PI * Math.pow(R,2);

  System.out.println("El área de de la circunderencia es: " + area);
  }
}
