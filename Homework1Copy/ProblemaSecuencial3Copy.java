import javax.swing.JOptionPane;
public class ProblemaSecuencial3Copy {
  public static void main(String[] args) {
    //
double B = Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte la base del triangulo y del rectangulo: "));
double A = Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte la altura del triangulo y del rectangulo unidos: "));
double C = Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte la altura del rectangulo: "));

  double AT = (B * (A-C))/2;
  double AR = B * C;
  double area = AT + AR;

JOptionPane.showMessageDialog(null,"El area del triangulo es: " + AT + "\nEl area del rectangulo es: " + AR + "\n El area del terreno es: " + area);
//JOptionPane.showMessageDialog(null,"El area del rectangulo es: " + AR);
//JOptionPane.showMessageDialog(null,"El area del terreno es: " + area);

  }
}
