package ProblemSolving.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
            
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
      
     
    }
}
