import java.util.Scanner;

public class Chimefon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final String DIA = "domingo";
    final String TURN = "matutino";
    System.out.println("Ingrese el tiempo de la llamada: ");
    int TI = input.nextInt();
    Scanner TD = new Scanner(System.in);
    System.out.println("Ingrese el día: ");
    String DI = TD.nextLine();
    Scanner MV = new Scanner(System.in);
    System.out.println("Ingrese el turno: ");
    String TU = MV.nextLine();
    double PAG; //Pago por el tiempo
    double IMP; //Impuesto

    if (TI <= 5)
      PAG = TI * 1;
      else if (TI <= 8)
        PAG = (TI - 5) * .8 + 5;
        else if (TI <= 10)
          PAG = (TI - 8) * .7 + 7.4;
          else {
            PAG = (TI - 10) * .5 + 8.8;
          }

          if (DI.equals(DIA))
            IMP = PAG * .03;
            else if (TU.equals(TURN))
              IMP = PAG * .15;
              else {
                IMP = PAG * .1;
              }
        double TOT = PAG + IMP;
        System.out.println("El pago es de: " + PAG);
        System.out.println("El impuesto es de: " + IMP);
        System.out.println("El pago total será de: " + TOT);

  }
}
