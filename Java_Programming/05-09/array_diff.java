// Program to calculate the difference of all elements in an array, subtracting from the first element

import java.util.Scanner;

public class array_diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int diff = arr[0];
        for(int i = 1; i < n; i++){
            diff -= arr[i];
        }

        System.out.println("Diff of array: "+ diff);

        sc.close();
    }
}
