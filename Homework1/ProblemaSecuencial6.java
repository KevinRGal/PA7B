import java.util.Scanner;

public class ProblemaSecuencial6 {
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
  System.out.println("Ingrese las horas trabajadas por semana: ");
  double HT = input.nextDouble();

  System.out.println("Ingrese el pago por hora: ");
  double PH = input.nextDouble();
  double SS = HT*PH;
  System.out.println("El sueldo semanal es de: $" + SS);
  }
}
