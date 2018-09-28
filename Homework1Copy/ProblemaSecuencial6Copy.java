import javax.swing.JOptionPane;

public class ProblemaSecuencial6Copy {
  public static void main(String[] args) {
    //
double HT = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas por semana: "));
double PH = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el pago por hora: "));

  double SS = HT*PH;
  JOptionPane.showMessageDialog(null, "El sueldo semanal es de: $" + SS);
  }
}
