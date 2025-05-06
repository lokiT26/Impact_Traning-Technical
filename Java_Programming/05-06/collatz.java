// Chander started working for Bing and he wanted him to write a program to generate Collatz Sequence. The rules for generating the Collatz sequence are: If n is even, n = n / 2. If n is odd, n = 3n + 1.
// For example, if the starting number is 5 the sequence is: 5 -> 16 -> 8 -> 4 -> 2 -> 1 It has been proved for almost all integers, that the repeated application of the above rule will result in a sequence that ends in 1.

// Input Format
// The input is an integer 'n' which denotes the first term of the sequence.

// Output Format
// As output, print the numbers in the sequence and also print the number of times the rule has to be applied in order to reach 1.

import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        System.out.println(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
            count++;
        }
        System.out.println(count);
        
        sc.close();
    }
}
