// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

public class merge_sorted_arr {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6}; 
        int m = 3, n = 3;

        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n -1;

        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[pMerge--] = nums1[p1--];
            } else{
                nums1[pMerge--] = nums2[p2--];
            }
        }

        for(int i = 0; i < m+n; i++){
            System.out.println(nums1[i]);
        }
    }
}
