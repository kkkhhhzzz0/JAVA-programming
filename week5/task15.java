import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.println("Enter the first city:");
        String city1 = scanner.nextLine();

        System.out.println("Enter the second city:");
        String city2 = scanner.nextLine();

        // Check if (city1.compareTo(city2) < 0), then the cities in alphabetical order are city1 + city2.
        if (city1.compareTo(city2) < 0) {
            System.out.println("Cities in alphabetical order: " + city1 + ", " + city2);
        } else {
            // Else the cities in alphabetical order are city2 + city1.
            System.out.println("Cities in alphabetical order: " + city2 + ", " + city1);
        }

        scanner.close();
    }
}
