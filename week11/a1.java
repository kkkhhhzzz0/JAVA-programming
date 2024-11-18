package week11;

public class a1 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };
        int rows = array.length;
        System.out.println("number of rows: " + rows);
        if (rows > 0) {
            int columns = array[0].length;
            System.out.println("number of columns: " + columns);
        } else {
            System.out.println("array is empty");
        }
    }
}
    

