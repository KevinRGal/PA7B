import java.util.Scanner;

public class OrdenarNumero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first number");
    int number1 = input.nextInt();

    System.out.println("Enter the second number");
    int number2 = input.nextInt();

    System.out.println("Enter the third number");
    int number3 = input.nextInt();

    if (number1 >= number2 && number2 >= number3) {
      System.out.println("The numbers from highest to lowest are: " + number1 + ", " + number2 + ", " + number3);
    } else if (number1 >= number3 && number3 >= number2) {
      System.out.println("The numbers from highest to lowest are: " + number1 + ", " + number3 + ", " + number2);
    } else if (number2 >= number1 && number1 >= number3) {
        System.out.println("The numbers from highest to lowest are: " + number2 + ", " + number1 + ", " + number3);
    } else if (number2 >= number3 && number3 >= number1) {
        System.out.println("The numbers from highest to lowest are: " + number2 + ", " + number3 + ", " + number1);
    } else if (number3 >= number1 && number1 >= number2) {
          System.out.println("The numbers from highest to lowest are: " + number3 + ", " + number1 + ", " + number2);
    } else {
              System.out.println("The numbers from highest to lowest are: " + number3 + ", " + number2 + ", " + number1);
            }
  }

}
