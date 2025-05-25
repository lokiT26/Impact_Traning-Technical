// Rohit likes to play with numbers. He started to frame a matrix called uniformity matrix where he will be using either completely odd numbers or completely even numbers but not both. Write a program to check whether he has framed the matrix in the correct order or not.

import java.util.Scanner;

public class uniformity_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        boolean isEven = nums[0][0] % 2 == 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(isEven != (nums[i][j] % 2 == 0)){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");

        sc.close();
    }
}
