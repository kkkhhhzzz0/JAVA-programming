import java.util.Scanner;
 public class task4
  { @SuppressWarnings("resource")
public static void main(String[] args)
     { Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the first number: ");
          double num1 = scanner.nextDouble(); System.out.print("Enter the second number: ");
           double num2 = scanner.nextDouble(); double resultMax = Math.max(num1, num2); double resultMin = Math.min(num1, num2);
            double resultAbsNum1 = Math.abs(num1); double resultAbsNum2 = Math.abs(num2); double resultRandom = Math.random();
             System.out.println("The maximum of " + num1 + " and " + num2 + " is " + resultMax); System.out.println("The minimum of " + num1 + " and " + num2 + " is " + resultMin);
              System.out.println("The absolute value of " + num1 + " is " + resultAbsNum1);
               System.out.println("The absolute value of " + num2 + " is " + resultAbsNum2);
                System.out.println("A random number between 0 and 1 is " + resultRandom); } }