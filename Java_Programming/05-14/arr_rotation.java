// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

import java.util.Scanner;

public class arr_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Array elements: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter steps: ");
        int k = sc.nextInt();

        k %= n;
        rotate(nums, 0, n-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, n-1);

        for(int num : nums){
            System.out.print(num + " ");
        }
        sc.close();
    }
    public static void rotate(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }

}
