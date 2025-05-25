// Maximum element in each column

import java.util.Scanner;

public class max_in_col {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i < m; i++){
            max = matrix[0][i];
            for(int j = 0; j < n; j++){
                if(matrix[j][i]>max){
                    max = matrix[j][i];
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}
