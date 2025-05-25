// find the transpose of the given 2D matrix.

import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose matrix is:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
