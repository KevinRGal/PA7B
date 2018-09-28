import javax.swing.JOptionPane;

public class ProblemaSecuencial4Copy {
  public static void main(String[] args) {
    //
double R = Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte la base del triangulo rectangulo y radio: "));
double H = Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte la hipotenusa del triangulo rectangulo: "));
  double SQRT = (H*H) - (R*R);
  double C = Math.sqrt(SQRT);
  double AT = 2*(R*C/2);
  double PI = 3.1416;
  double AC = (PI * Math.pow(R,2))/2;
  double area = AT + AC;
JOptionPane.showMessageDialog(null,"El cateto faltante es: " + C + "\nEl area triangular es: " + AT + "\nEl area circular es: " + AC + "\nEl area de la figura es: " + area);
  }
}
