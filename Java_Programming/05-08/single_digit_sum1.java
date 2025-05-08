// Write a program to repeatedly calculate the sum of the digits of a given number until the result is a single digit.
// Second approach (using only one loop)

import java.util.Scanner;

public class single_digit_sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        
        while (num != 0) {
            sum += num % 10;
            num /= 10;

            if (sum >= 10 && num == 0){
                num = sum;
                sum = 0;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
