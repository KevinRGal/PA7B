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

double BMI = weightInKilograms / Math.pow(heightInMeters,2);

System.out.println ("Your BMI is: "+ BMI);

if (BMI < 16)
System.out.println("You are seriously underweight");
else if (BMI < 18)
System.out.println("You are underweight");
else if (BMI < 24)
System.out.println("You are normal weight");
else if (BMI < 29)
System.out.println("You are overweight");
else if (BMI < 35)
System.out.println("You are seriously overweight");
else
System.out.println("You are graveky overweight");
  }
}
