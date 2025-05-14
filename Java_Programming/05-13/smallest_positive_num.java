// You are given an array a[] of n integers. The task is to find the smallest positive number missing from the array.

// Input Format
// First line - n, the size of an array Second line - all the n elements (a[i] can be positive, negative, zero)


import java.util.Arrays;
import java.util.Scanner;

public class smallest_positive_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x = 1;
        for(int i = 0; i < n; i++){
            if(arr[i]>0){
                if(arr[i]==x){
                    x++;
                }else if(arr[i]==x-1){  // For duplicate elements (like 1, 1, 2, 2, 3)
                }else{
                    break;
                }
            }
        }
        System.out.println(x);
        sc.close();
    }
}