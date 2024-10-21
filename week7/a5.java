package week7;

import java.util.Scanner;

public class a5 {
    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the message: ");
            String message = scanner.nextLine();
            System.out.print("Enter the number of times to print the message: ");
            int n = scanner.nextInt();
            nPrintln(message, n);
        }
    }
}