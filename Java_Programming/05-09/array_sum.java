// // Program to calculate the sum of all elements in an array

import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        System.out.println("Sum of array: "+ sum);

        sc.close();
    }
}
