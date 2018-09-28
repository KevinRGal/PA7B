import javax.swing.JOptionPane;

public class ViajeDeEstudiosCopy {
  public static void main(String[] args) {
    int NA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de alumnos que realizaran el viaje: "));
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
      JOptionPane.showMessageDialog(null, "El pago individual por alumno es de: " + PA + "\nEl pago total es de: " + TOT);

    }
  }
