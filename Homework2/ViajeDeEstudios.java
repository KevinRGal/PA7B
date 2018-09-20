import java.util.Scanner;

public class ViajeDeEstudios {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese el número de alúmnos que realizarán el viaje: ");
    int NA = input.nextInt();
    double PA;

      if (NA >= 100)
      PA = 65;
      else if (NA >= 50)
      PA = 70;
      else if (NA >= 30)
      PA = 95;
      else {
        PA = 4000 / NA;
      }
      double TOT = PA * NA;
      System.out.println("El pago individual por alumno es de: " + PA);
      System.out.println("El pago total es de: " + TOT);

    }
  }
