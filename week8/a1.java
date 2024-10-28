package week8;

public class a1 {
    public static void main(String[] args) {
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                values[i] = i + values[i - 1];
            } else {
                values[i] = i;
            }
        }
        values[0] = values[1] + values[4];
    }
}