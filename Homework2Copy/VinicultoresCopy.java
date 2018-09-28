import javax.swing.JOptionPane;

public class VinicultoresCopy{
  public static void main(String[] args) {
    final String Tipo = "A";
    final String Tipo2 = "B";
    String TI = JOptionPane.showInputDialog(null, "Ingrese el tipo de uva: ");
    int TA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de uva: "));
    int K = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de kilos vendidos: "));
    double P = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio inicial por kilo: "));
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
    JOptionPane.showMessageDialog(null, "La ganancia obtenida es de: " + GA);
  }
}
