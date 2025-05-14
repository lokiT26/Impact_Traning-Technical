// You are given an array containing the heights and weights of individuals standing in a row. The array is structured such that each even index represents the height of a person, while each odd index represents the weight of the same person.

// If two or more people have the same maximum height, consider the first one encountered.
// If two or more people have the same maximum weight, consider the first one encountered.
// Your task is to find and return a string denoting two integers separated by a space. The first integer represents the person number with the maximum height. The second integer represents the person number with the maximum weight.
// Note: Consider 1 based indexing

// Input Specification:
// input1: An integer value representing the number of individuals.
// input2: An integer array of size 2 * input1 integers representing the heights and weights of the individuals.

// Output Specification:
// Return a string denoting two integers separated by a space. The first integer represents the person number with the maximum height. The second integer represents the person number with the maximum weight.


import java.util.Scanner;

public class height_and_weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n * 2;
        int[] arr = new int[size];

        for(int i = 0; i < 2*n; i++){
            arr[i] = sc.nextInt();
        }
        int mx_height = arr[size-1], mx_weight = arr[size-2];
        int i_height = (size-1) / 2, i_weight = (size-2) / 2;

        for(int i = size-4, j = size-3; i >= 0; i-=2, j-=2){
            if(mx_weight <= arr[i]){
                mx_weight = arr[i];
                i_weight = i / 2;
            }
            if(mx_height <= arr[j]){
                mx_height = arr[j];
                i_height = j / 2;
            }
        }

        System.out.println("Position: "+(i_height+1)+", "+(i_weight+1));
        System.out.println("Value: " + mx_height+", "+mx_weight);

        sc.close();
    }
}
