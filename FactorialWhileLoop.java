import javax.swing.JOptionPane;

public class FactorialWhileLoop {
  public static void main(String[] args) {

// Numero para el limite del factorial
    int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value"));

// Numero del factorial
    int fact = 1;

// Sentinela
    int i = 1;
    while(i <= value) {
      fact = fact * i;
      i ++;
    }
    JOptionPane.showMessageDialog(null,"El factorial de " + value + " es: " + fact, "Calcular Factorial", JOptionPane.WARNING_MESSAGE);
  }
}
