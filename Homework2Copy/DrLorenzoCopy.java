import javax.swing.JOptionPane;

public class DrLorenzoCopy {
  public static void main(String[] args) {

int NC = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de consultas: "));
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
          JOptionPane.showMessageDialog(null, "El costo por cita es de: " + CC + "\nEl monto por el tratamiento es de: " + TOT);

  }
}
