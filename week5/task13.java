import java.util.Scanner;
 public class task13
  { public static void main(String[] args) 
    { @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in); 
        System.out.print("Enter a character: ");
         String s = input.nextLine(); char ch = s.charAt(0);
          System.out.println("The character entered is " + ch); } }