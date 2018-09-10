import java.util.Scanner;

public class ComputeBMI  {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    final double KILOGRAMS_PER_POUND = 0.4535923;
    final double METERS_PER_INCH = 0.0254;


    System.out.println("Enter weight in punds: ");
    double weight = input.nextDouble();

    System.out.println("Enter height in inches");
    double height = input.nextDouble();

    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;

double IBM = weightInKilograms / Math.pow(heightInMeters,2);

System.out.println ("Your IBM is: "+ IBM);
  }
}
