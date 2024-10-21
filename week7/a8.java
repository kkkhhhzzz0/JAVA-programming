package week7;

public class a8 {
    public static void main(String[] args) {
        System.out.println("the first 50 prime number are\n");
        printPrimeNumber(50);
    }

    public static void printPrimeNumber(int numberOfPrime) {
        final int NUMBER_OF_PRIME_PER_LINE = 10;
        int count = 0;
        int number = 2;
        while (count < numberOfPrime) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PRIME_PER_LINE == 0) {
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
