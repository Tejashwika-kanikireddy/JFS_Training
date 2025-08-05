public class MatrixMultiplication {
    public static void main(String[] args) {
        
        int[][] matrixA = {
            {4, 5},
            {6, 7}
        };

       
        int[][] matrixB = {
            {4, 5},
            {6, 7}
        };

        
        int[][] result = new int[2][2];

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

       
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
