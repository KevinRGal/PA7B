import javax.swing.JOptionPane;

public class ElHarapientoDistinguidoCopy {
  public static void main(String[] args) {
double CT = Double.parseDouble(JOptionPane.showInputDialog(null, "Insert cost of the suit."));

    Double DE;
    if (CT < 2500)
        DE = CT * .08;
    else {
      DE = CT * .15;
    }
    Double PF = CT - DE;
    JOptionPane.showMessageDialog(null, "Final price of suit: " + PF + "\nDiscount of: " + DE);
  }
}
