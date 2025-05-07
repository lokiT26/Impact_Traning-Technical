// Question: Write a Java program that takes two integers as input: `number` and `m`. 
// The program should find and print the nearest multiple of `m` to the given `number`. 
// If the `number` is already a multiple of `m`, print the `number` itself. 
// In case of a tie (equal distance to two multiples), print the larger multiple.

import java.util.Scanner;

public class nearest_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        if (number % m == 0){
            System.out.println(number);
            System.exit(0);
        }
        
        int q = number / m;
        int smaller_multiple = q * m;
        int larger_multiple = (q + 1) * m;

        int d1 = number-smaller_multiple;
        int d2 = larger_multiple-number;

        if (d1 < d2){
            result = smaller_multiple;
        } else{
            result = larger_multiple;
        }

        System.out.println(result);
        sc.close();
    }
}
