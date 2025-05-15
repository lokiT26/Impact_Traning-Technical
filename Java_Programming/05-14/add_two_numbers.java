// This program takes two arrays of integers as input, where each array represents a number with its digits stored in reverse order. 
// It then adds the two numbers digit by digit, handling carry-over, and prints the resulting number in reverse order.

import java.util.Scanner;

public class add_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        int i = n - 1, j = m - 1, carry = 0, sum = 0;
        while(i >= 0 || j >= 0 || carry == 1){
            
            sum += carry;    
            if(i>=0) {sum += arr1[i];}
            if(j>=0) {sum += arr2[j];}

            carry = sum / 10;
            int result = sum % 10;

            System.out.print(result+ " ");
            i--; j--; sum=0;
        }
        sc.close();
    }
}
