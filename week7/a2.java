package week7;

public class a2 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    public static int max(int numb1, int numb2) {
        int result;
        if (numb1 > numb2) {
            result = numb1;
        } else {
            result = numb2;
        }
        return result;
    }
}