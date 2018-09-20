import java.util.Scanner;

public class Vinicultores{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final String Tipo = "A";
    final String Tipo2 = "B";
    System.out.println("Ingrese el tipo de uva: ");
    String TI = input.nextLine();
    System.out.println("Ingrese el tamaño de uva: ");
    int TA = input.nextInt();
    System.out.println("Ingrese la cantidad de kilos vendidos: ");
    int K = input.nextInt();
    System.out.println("Ingrese el precio inicial por kilo: ");
    double P = input.nextInt();
    if (TI.equals(Tipo) && TA == 1) {
    P = P + .20;
  } else if (TI.equals(Tipo) && TA == 2) {
    P = P + .30;
  } else if (TI.equals(Tipo2) && TA == 1) {
    P = P - .30;
  } else if (TI.equals(Tipo2) && TA == 2) {
    P = P - .50;
  }
    double GA = P * K;
    System.out.println("La ganancia obtenida es de: " + GA);
  }
}
