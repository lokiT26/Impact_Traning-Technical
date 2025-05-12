// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

import java.util.Scanner;

public class median_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }

        int[] nums3 = new int[m+n];
        int p1 = m - 1, p2 = n - 1, p3 = m+n - 1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums3[p3--] = nums1[p1--];
            } else{
                nums3[p3--] = nums2[p2--];
            }
        }
        if (p1 >= 0){
            while(p1 >= 0)
            nums3[p3--] = nums1[p1--];
        }
        if (p2 >= 0){
            while(p2 >= 0)
            nums3[p3--] = nums2[p2--];
        }

        int x = (m + n) / 2;
        double median;
        if((m + n) % 2 == 0){
            median = (nums3[x - 1] + nums3[x]) / 2.0;
        }
        else{
            median = nums3[x];
        }
        for(int i = 0; i < m+n; i++){
            System.out.print(nums3[i]+" ");
        }
        System.out.println("Median: "+ median);
        sc.close();
    }
}
