package week11;

public class a7 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int i1 = (int) (Math.random() * array.length);
                int j1 = (int) (Math.random() * array[row].length);
                int temp = array[row][column];
                array[row][column] = array[i1][j1];
                array[i1][j1] = temp;
            }
        }
        System.out.println("array after shuffling:");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}
