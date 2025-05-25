// Rotate the matrix 90 degree clockwise

import java.util.Scanner;

public class rotate_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                System.out.print(nums[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
