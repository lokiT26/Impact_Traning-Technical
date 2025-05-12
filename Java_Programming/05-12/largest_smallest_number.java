/**
 * Question:
 * Write a Java program to read an integer `n` from the user, followed by `n` integers.
 * The program should determine and print the largest and smallest numbers among the entered integers.
 */

import java.util.Scanner;

public class largest_smallest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 1; i < n; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            } 
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest: "+ largest+", Smallest: "+ smallest);
        sc.close();
    }
}
