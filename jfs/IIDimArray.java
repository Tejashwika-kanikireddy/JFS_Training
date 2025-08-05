// IIDimArray.java
public class IIDimArray {
    public static void main(String[] args) {
        int[][] i = new int[2][3];
        i[0][0] = 1; i[0][1] = 2; i[0][2] = 3;
        i[1][0] = 4; i[1][1] = 5; i[1][2] = 6;

        int[][] j = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Accessing array using index
        int rowSize = i.length;
        for (int k = 0; k < rowSize; k++) {
            int colSize = i[k].length;
            for (int l = 0; l < colSize; l++) {
                System.out.print(i[k][l] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Accessing array using for-each loop
        for (int[] row : j) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
