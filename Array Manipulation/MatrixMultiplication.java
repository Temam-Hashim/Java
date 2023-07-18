import java.util.*;

public class MatrixMultiplication {

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;
        int[][] c = new int[rowsA][colsB];

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Incompatible matrix sizes for multiplication");

        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                c[i][j] = 0;
                for (int k = 0; k < rowsA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] b = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 },

        };
        int[][] c = matrixMultiplication(a, b);
        // System.out.println("Array Multiplication:");
        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < b[0].length; j++) {
        // System.out.print(c[i][j] + " ");

        // }
        // System.out.println(" ");

        // }
        System.out.println("Array Multiplication:");
        for (int[] row : c) {
            System.out.println(Arrays.toString(row));
        }

    }
}
