import java.util.Scanner;

public class ProblemaSecuencial4 {
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
  System.out.println("Inserte la base del triángulo rectángulo y radio: ");
  double R = input.nextDouble();

  System.out.println("Inserte la hipotenusa del triángulo rectángulo: ");
  double H = input.nextDouble();
  double SQRT = (H*H) - (R*R);
  double C = Math.sqrt(SQRT);
  double AT = 2*(R*C/2);
  double PI = 3.1416;
  double AC = (PI * Math.pow(R,2))/2;
  double area = AT + AC;

    System.out.println("El cateto faltante es: " + C);
    System.out.println("El área triangular es: " + AT);
    System.out.println("El área circular es: " + AC);
    System.out.println("El área de la figura es: " + area);
  }
}
