import javax.swing.JOptionPane;

public class WhileLoop {
  public static void main(String[] args) {

  int number = (int)(Math.random() * 100);

int guess = -1;

//MIENTRAS (CONDICION)
while(guess != number) {
  guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a magic number between 0 and 100"));

if (guess == number ) {
  JOptionPane.showMessageDialog(null,"Yess, the number is " + number);
} else if (guess > number) {
  JOptionPane.showMessageDialog(null,"Your number is too high");
} else {
  JOptionPane.showMessageDialog(null,"Your number is too low");
}

}

  }
}
