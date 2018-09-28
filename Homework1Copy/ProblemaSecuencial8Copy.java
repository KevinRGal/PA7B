import javax.swing.JOptionPane;

public class ProblemaSecuencial8Copy {
  public static void main(String[] args) {
    //
double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura de la alberca: "));
double L = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo de de la alberca: "));
double N = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ancho de la alberca: "));
double CM = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el costo por metro cubico: "));

  double V = A*L*N;
  double PAG = V*CM;
JOptionPane.showMessageDialog(null, "El pago a realizar por el consumo es de: $" + PAG);

  }
}
