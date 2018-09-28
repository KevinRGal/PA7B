import javax.swing.JOptionPane;

public class PuebloDesconocido2Copy  {
  public static void main (String[] args) {
    int TT = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your card type: "));
    double LA = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your current credit limit"));
    double AC; //Aumento de crédito
if (TT == 1)
AC = LA * .25;
else if (TT == 2)
AC = LA * .35;
else if (TT == 3)
AC = LA * .40;
else
AC = LA * .50;

double NC = LA + AC; // Nuevo límite de crédito
JOptionPane.showMessageDialog(null, "You credit increse is: " + AC + "\nYour new credit limit is: " + NC);
  }
}
