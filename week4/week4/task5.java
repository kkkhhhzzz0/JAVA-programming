package week4;

import java.util.Scanner;

public class task5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = sc.nextDouble();
        double gratuityrate = sc.nextDouble();
        double gratuity = (subtotal * gratuityrate)*0.01;
        System.out.println("Your gratuity is: $" + gratuity + " and total is $" + (subtotal + gratuity) );

    }
}
