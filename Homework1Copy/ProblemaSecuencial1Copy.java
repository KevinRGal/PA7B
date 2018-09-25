import javax.swing.JOptionPane;

public class ProblemaSecuencial1Copy {
  public static void main(String[] args) {
    //
double a = Double.parseDouble(JOptionPane.showInputDialog("Inserte la base del rectánculo"));

double b = Double.parseDouble(JOptionPane.showInputDialog("Inserte la altura del rectánculo"));
    //
  double area = a * b;

JOptionPane.showMessageDialog(null,"El área del rectngulo es: " + area);
  }

}
