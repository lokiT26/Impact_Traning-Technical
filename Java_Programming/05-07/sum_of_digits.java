// This program calculates the sum of even and odd digits in a given number.
// The program takes an integer input from the user and iterates through each digit of the number. It checks if the digit is even or odd and adds it to the respective sum. Finally, it prints the sums of even and odd digits.

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenDigitSum = 0;
        int oddDigitSum = 0;

        while(n != 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenDigitSum += digit;
            } else {
                oddDigitSum += digit;
            }
            n /= 10;
        }
        System.out.println("Sum of even digits: " + evenDigitSum);
        System.out.println("Sum of odd digits: " + oddDigitSum);
        sc.close();
    }
}
