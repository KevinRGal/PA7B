import javax.swing.JOptionPane;

public class Mayor3CantidadesCopy {
  public static void main(String[] args) {
    double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number"));
    double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second number"));
    double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the third number"));
    double M;
    if (A > B && A > C) {
      M = A;
    } else if (B > C && C > B) {
      M = B;

    } else {
      M = C;
    }
    JOptionPane.showMessageDialog(null, M + " is major.");
  }

}
