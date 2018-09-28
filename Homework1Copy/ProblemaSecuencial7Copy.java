import javax.swing.JOptionPane;

public class ProblemaSecuencial7Copy {
  public static void main(String[] args) {

double CM = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de metros requeridos: "));
  double PG = CM/0.0254;
  JOptionPane.showMessageDialog(null, "La cantidad de tela en pulgadas que debe pedir es: " + PG);

  }
}
