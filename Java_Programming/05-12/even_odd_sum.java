// Question: Write a Java program to read 'n' integers from the user, store them in an array, and calculate the sum of even numbers and the sum of odd numbers separately.

import java.util.Scanner;

public class even_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even_num_sum = 0, odd_num_sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                even_num_sum += arr[i];
            }
            else{
                odd_num_sum += arr[i];
            }
        }
        System.out.println("Sum of even numbers: "+ even_num_sum);
        System.out.println("Sum of odd numbers: "+ odd_num_sum);
        sc.close();
    }    
}
