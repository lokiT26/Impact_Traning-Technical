/**
 * This program checks whether a given number is an Armstrong number or not.
 * Definition of an Armstrong Number: An Armstrong number (also known as a narcissistic number, pluperfect number, or pluperfect digital invariant) is a number that is equal to the sum of its own digits raised to the power of the number of digits.
 * 
 * For example:
 * - 153 is an Armstrong number because:
 *   1^3 + 5^3 + 3^3 = 153
 * - 9474 is an Armstrong number because:
 *   9^4 + 4^4 + 7^4 + 4^4 = 9474
 */

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp1 = num, temp2 = num;
        int digit_count = 0;
        int sum = 0;

        while(temp1 > 0){
            temp1 /= 10;
            digit_count++;
        }

        while(temp2 > 0){
            sum += (int)Math.pow((temp2 % 10), digit_count);
            temp2 /= 10;
        }

        if(sum == num){
            System.out.println("Armstrong Number");
        } else{
            System.out.println("Not a Armstrong Number");
        }
        sc.close();
    }    
}
