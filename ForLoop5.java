import javax.swing.JOptionPane;
public class ForLoop5{
public static void main(String[] args) {

  int i= Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el numero de la tabla que deseas realizar"));
  String salida="";
for( int j = 1; j <=10 ; j++ ){
salida += i + " x " + j + " = " + (i * j)+ "\n";
/*
int tabla= Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el numero de la tabla que deseas realizar"));
for(int i=0; i<=9; i++)
JOptionPane.showMessageDialog(null, tabla + " x " + (i+ 1) + " = " + (i * 1)* tabla)"\n";
*/
}
JOptionPane.showMessageDialog(null, salida);
}
}
