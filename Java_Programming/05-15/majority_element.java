// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.Scanner;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int count = 0, maj = 0;

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            if(count == 0){
                count = 1;
                maj = nums[i];
            } else{
                if(nums[i] == maj){
                    count += 1;
                }
                else{
                    count -= 1;
                }
            }
        }
        System.out.println(maj);
        sc.close();
        
    }
}
