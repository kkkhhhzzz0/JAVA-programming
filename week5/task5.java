import java.util.Scanner;
 import java.lang.Math; public class task5 
 { @SuppressWarnings("resource")
public static void main(String[] args) 
    { Scanner scanner = new Scanner(System.in);
         System.out.print("Enter side a: ");
          double a = scanner.nextDouble();
           System.out.print("Enter side b: ");
            double b = scanner.nextDouble();
             System.out.print("Enter side c: ");
              double c = scanner.nextDouble();
               double A = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
                double B = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
                 double C = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
                  System.out.println("Angle A: " + A + " degrees");
                   System.out.println("Angle B: " + B + " degrees");
                    System.out.println("Angle C: " + C + " degrees"); } }