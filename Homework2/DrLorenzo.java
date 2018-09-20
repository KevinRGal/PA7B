import java.util.Scanner;

public class DrLorenzo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el número de consultas: ");
    int NC = input.nextInt();
    double CC; //Costo de la cita
    double TOT;
    if (NC <= 3){
      CC = 200;
      TOT = NC * CC;
    } else if (NC <= 5) {
        CC = 150;
        TOT = (NC - 3) * 150 + 600;
    }   else if (NC <= 8) {
          CC = 100;
          TOT = (NC - 5) * 100 + 900;
        }  else {
            CC = 50;
            TOT = (NC - 8) * 50 + 1200;
          }
        System.out.println("El costo por cita es de: " + CC);
        System.out.println("El monto por el tratamiento es de: " + TOT);

  }
}
