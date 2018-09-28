import javax.swing.JOptionPane;

public class NumeroMayorCopy {
  public static void main(String[] args) {
    int M;
    int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the fist number."));
    int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the second number."));

    if (A > B) {
      M = A;
      JOptionPane.showMessageDialog(null, M + " is the major");
    } else if (B > A) {
      M = B;
      JOptionPane.showMessageDialog(null, M + " is the major");
    } else {
      JOptionPane.showMessageDialog(null, "The numbers are iqual.");
     }
  }
}
