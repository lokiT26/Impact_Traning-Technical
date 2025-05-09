// Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all the values of i. Write a program to find whether 2 arrays are compatible or not.

import java.util.Scanner;

public class compatible_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array A: ");
        int a = sc.nextInt();
        int arr1[] = new int[a];
        for(int i = 0; i < a; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array B: ");
        int b = sc.nextInt();
        int arr2[] = new int[b];
        for(int i = 0; i < b; i++){
            arr2[i] = sc.nextInt();
        }

        if (a == b){
            for(int i = 0; i < a; i++){
                if(arr2[i]<=arr1[i]){
                    continue;
                } else{
                    System.out.println("Incompatible");
                    System.exit(0);
                }
            }
            System.out.println("Compatible");
        } else{
            System.out.println("Incompatible");
        }
        
        sc.close();
    }
}
