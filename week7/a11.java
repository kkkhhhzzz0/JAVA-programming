package week7;

import java.util.Random;

public class a11 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHAR_PER_LINE = 25;
        
        RandomCharGenerator generator = new RandomCharGenerator();
        
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = generator.getRandomLowerCaseLetter();
            if ((i + 1) % CHAR_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}

class RandomCharGenerator {
    private Random random = new Random();

    public char getRandomLowerCaseLetter() {
        return (char) ('a' + random.nextInt(26));
    }
}