// Finds the unique element in an array where all other elements appear exactly twice.

import java.util.Scanner;

public class unique_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int unique = 0;
        for(int i = 0; i < n; i++){
            unique ^= arr[i];
        }
        System.out.println(unique);

        sc.close();
    }    
}
