// Write a program to repeatedly calculate the sum of the digits of a given number until the result is a single digit.

import java.util.Scanner;

public class single_digit_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while (num / 10 != 0) {
            sum = 0; // Reset sum to 0 at the start of each iteration
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        System.out.println(sum);
        sc.close();
    }
}
