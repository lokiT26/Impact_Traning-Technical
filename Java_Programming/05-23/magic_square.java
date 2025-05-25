// A magic square is an arrangement of numbers (usually integers) in a square grid, there are numbers in the forward and backward main diagonals, all add up to the same number. Write a program to find whether a given matrix is a magic square or not.

import java.util.Scanner;

public class magic_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
                if(i == j){
                    sum1 += matrix[i][j];
                } if((i + j)== (n-1)){
                    sum2 += matrix[i][j];
                }
            }
        }
        if(sum1 == sum2){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        sc.close();
    } 
}
