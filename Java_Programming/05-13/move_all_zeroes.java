// Write a program to move all zeroes to the end of a given integer.
// Input Format:
// The first line of input contains a number of test cases T.
// For each test case, the first line of input contains a single integer of 0's and 1's.
// Output Format:
// The output contains a single-line integer value.

// Sample Input 0:
// 2
// 1010101
// 1000111
// Sample Output 0:
// 1111000
// 1111000

import java.util.Scanner;

public class move_all_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int res = 0, place = 1;
            while(arr[i] > 0){
                if(arr[i] % 10 == 1){
                    res += place;
                } else{
                    res *= 10;
                }
                place *= 10;
                arr[i] /= 10;
            }
            System.out.println(res);
        }

        sc.close();
    }
}
