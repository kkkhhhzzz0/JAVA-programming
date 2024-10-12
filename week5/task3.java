import java.util.Scanner;
 public class task3
  { @SuppressWarnings("resource")
public static void main(String[] args) { Scanner scanner = new Scanner(System.in); 
    System.out.print("Enter a number: "); double number = scanner.nextDouble(); 
     int roundedNumberCeil = (int) Math.ceil(number); int roundedNumberFloor = (int) Math.floor(number);
      long roundedNumberRound = Math.round(number);
       System.out.println("Rounded up to the nearest integer: " + roundedNumberCeil);
        System.out.println("Rounded down to the nearest integer: " + roundedNumberFloor);
         System.out.println("Rounded to the nearest integer: " + roundedNumberRound); } }