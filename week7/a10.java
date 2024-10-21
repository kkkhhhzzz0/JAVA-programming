package week7;

public class a10 {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static void main(String[] args) {
        char lowerCaseLetter = a10.getRandomLowerCaseLetter();
        System.out.println("Random Lowercase Letter: " + lowerCaseLetter);
        char upperCaseLetter = a10.getRandomUpperCaseLetter();
        System.out.println("Random Uppercase Letter: " + upperCaseLetter);
    }
}