import javax.swing.JOptionPane;

public class ChimefonCopy {
  public static void main(String[] args) {
    final String DIA = "domingo";
    final String TURN = "matutino";
    int TI = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tiempo de la llamada: "));
    String DI = JOptionPane.showInputDialog(null, "Ingrese el dia: ");
    String TU = JOptionPane.showInputDialog(null, "Ingrese el turno: ");
    double PAG; //Pago por el tiempo
    double IMP; //Impuesto

    if (TI <= 5)
      PAG = TI * 1;
      else if (TI <= 8)
        PAG = (TI - 5) * .8 + 5;
        else if (TI <= 10)
          PAG = (TI - 8) * .7 + 7.4;
          else {
            PAG = (TI - 10) * .5 + 8.8;
          }

          if (DI.equals(DIA))
            IMP = PAG * .03;
            else if (TU.equals(TURN))
              IMP = PAG * .15;
              else {
                IMP = PAG * .1;
              }
        double TOT = PAG + IMP;
        JOptionPane.showMessageDialog(null, "El pago es de: " + PAG + "\nEl impuesto es de: " + IMP + "\nEl pago total sera de: " + TOT);
  }
}
