package week11;

public class a6 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int row =0; row < matrix.length; row++){
        for (int column =0; column < matrix[0].length; column++){
            matrix[row][column] = (int)(Math.random()*20);
}
        }
        int maxOfRow=0;
        int indexOfMax=0;
    for(int column=0; column<matrix[0].length; column++){
        maxOfRow=matrix[0][column];
        int totalOfThisRow=0;
        
        for(int row=0; row<matrix.length; row++){
            totalOfThisRow+=matrix[row][column];
            if(matrix[row][column]>maxOfRow){
                maxOfRow=matrix[row][column];
                indexOfMax=row;
            }
        }
        System.out.println("The total of row "+column+" is "+totalOfThisRow+" and the max is "+maxOfRow+" in row "+indexOfMax);
    }
        }
    }
