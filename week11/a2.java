package week11;

import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
          System.out.print("Enter the number of rows and columns: ");
           int rows = input.nextInt();
            int columns = input.nextInt();
            
         for (int row = 0; row < rows; row++) 
         { for (int column = 0;column < columns; column++)
              { System.out.print("Enter value at [" + row + ", " + column + "]: "); 
              matrix[row][column] = input.nextInt();
             }
             }  input.close();
             System.out.println("Matrix:");
              for (int i = 0; i < rows; i++) { for (int j = 0; j < columns; j++) 
                { System.out.print(matrix[i][j] + " ");
             } System.out.println(); 
            } 
        } 
    }