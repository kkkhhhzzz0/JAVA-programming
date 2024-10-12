package week4;
import java.util.Scanner;

public class task16 {
        @SuppressWarnings("resource")
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            System.out.println(year + " is " + (leapYear ? "" : "not ") + "a leap year");
        }
}
