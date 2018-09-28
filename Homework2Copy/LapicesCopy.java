import javax.swing.JOptionPane;

public class LapicesCopy {
  public static void main(String[] args) {
int X = Integer.parseInt(JOptionPane.showInputDialog(null, "Inser number of pencils."));
    double PAG;
    if (X < 1000)
    PAG = (X * .90);
    else {
      PAG = (X * .85);
    }
    JOptionPane.showMessageDialog(null, "The payment for the pencils is: " + PAG);
  }
}
