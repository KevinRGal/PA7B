import javax.swing.JOptionPane;

public class LaLangostaAhumadaCopy {
  public static void main(String[] args) {
int NP = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de personas: "));
    double TOT;
    if (NP <= 200)
    TOT = NP * 95;
    else if (NP <= 300)
    TOT = NP * 85;
    else{
      TOT = NP * 75;
    }
    JOptionPane.showMessageDialog(null, "El total a pagar por el banquete es de: " + TOT);
  }
}
