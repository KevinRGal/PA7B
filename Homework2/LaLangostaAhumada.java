import java.util.Scanner;

public class LaLangostaAhumada {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese el número de personas: ");
    int NP = input.nextInt();
    double TOT;
    if (NP <= 200)
    TOT = NP * 95;
    else if (NP <= 300)
    TOT = NP * 85;
    else{
      TOT = NP * 75;
    }
    System.out.println("El total a pagar por el banquete es de: " + TOT);
  }
}
