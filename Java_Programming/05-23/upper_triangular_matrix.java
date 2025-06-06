// Irene who is one of the organizers of the event has arranged the audience(boys and girls)in a matrix format. Separate values were given to boys and girls which are 1 and 0 respectively. The arrangement should be done based on one condition. She should arrange all the girls below the main diagonal since it is done in a matrix format. If she did the arrangement in a proper way she will win the prize or else not. Help the Judges to find out whether she wins the prize. If she wins you can print "Upper triangular matrix" or else "Not an Upper triangular matrix". Write a program to check whether the given matrix is an upper triangular matrix or not
// Sample Input:
//  3
//  0 0 1
//  0 2 3
//  0 0 5
// Sample Output:
//  Upper triangular matrix

import java.util.Scanner;

public class upper_triangular_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(matrix[i][j] != 0){
                    System.out.println("Not an Upper triangular matrix");
                    System.exit(0);
                }
            }
        }
        System.out.println("Upper triangular matrix");

        sc.close();
    }
}
