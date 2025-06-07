// Given an array of integers and a window size k, find the maximum sum of any contiguous subarray of size k.
// Input:
//   First line: Integer k (window size)
//   Second line: Integer n (number of elements in the array)
//   Next n lines: n integers (elements of the array)
// Output:
//   Print the maximum sum of any contiguous subarray of size k.

import java.util.Scanner;

public class sliding_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win_size = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        if (win_size > n) {
            System.out.println("Window size larger than array.");
            sc.close();
            return;
        }

        int sum = 0;
        // Calculate initial window sum
        for (int i = 0; i < win_size; i++) {
            sum += nums[i];
        }
        int maxSum = sum;

        for (int i = win_size; i < n; i++) {
            sum = sum + nums[i] - nums[i - win_size];
            if (sum > maxSum) maxSum = sum;
        }
        System.out.println(maxSum);
        sc.close();
    }
}
