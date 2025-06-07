// Program to find the maximum sum of any three numbers in an array in O(n) time complexity

public class sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 7, 15};
        if (nums.length < 3) {
            System.out.println("Array must have at least three elements.");
            return;
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        int maxSum = first + second + third;
        System.out.println("Maximum sum of any three numbers: " + maxSum);
    }       
}