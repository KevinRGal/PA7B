import javax.swing.JOptionPane;
public class DoWhileLoop2{
public static void main(String[] args) {
int i;
int answer;
do{
  i= Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el numero de la tabla que deseas realizar"));
  String salida="";

  for( int j = 1; j <=10 ; j++ ) {
  salida += i + " x " + j + " = " + (i * j)+ "\n";
  }
JOptionPane.showMessageDialog(null, salida);

answer = JOptionPane.showConfirmDialog(null, "Quieres buscar otra tabla?");
}
 while(answer == JOptionPane.YES_OPTION);
  JOptionPane.showMessageDialog(null, "FIN");
}
  }
