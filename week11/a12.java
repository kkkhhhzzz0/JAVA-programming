package week11;

import java.util.Scanner;
 public class a12 { public static void main(String[] args)
     { try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter a 3-by-4 matrix row by row:");
          double[][] matrix = new double[3][4];
            for (int i = 0; i < 3; i++) 
            { for (int j = 0; j < 4; j++)
                 { matrix[i][j] = input.nextDouble();
                 } }
                 for (int j = 0; j < 4; j++) 
                 { double sum = sumColumn(matrix, j); 
                    System.out.printf("Sum of the elements at column %d is %.1f\n", j, sum); 
                }
    }
             }  public static double sumColumn(double[][] m, int columnIndex)
              { double sum = 0; for (double[] row : m)
                 { if (columnIndex >= 0 && columnIndex < row.length) 
                    { sum += row[columnIndex];
                     }
                     } return sum;
                     }
                     }