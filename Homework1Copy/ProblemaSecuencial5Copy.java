import javax.swing.JOptionPane;

public class ProblemaSecuencial5Copy {
  public static void main(String[] args) {
    //
int L = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte la cantidad de litros producidos: "));
double PG = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el precio por galon: "));
  double TG = L*3.785;
  double GA = TG*PG;
  JOptionPane.showMessageDialog(null, "Cantidad de galones producida: " + TG + "\nGanancia por la entrega de leche: " + GA);

  }
}
