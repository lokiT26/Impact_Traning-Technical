// Professor Kishore wanted the kids to learn about Special numbers. (A two-digit number is said to be a special number if the sum of sum of its digits and the product of its digits is equal to the number itself. For example, 19 is a special number. The digits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9. 10+9 = 19.)

// Can you help Kishore to write a program to find all special numbers between 2 limits m and n (both inclusive)? Assume that m and n are two-digit numbers.


import java.util.Scanner;

public class special_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;

            int sum = firstDigit + lastDigit;
            int product = firstDigit * lastDigit;

            if ((sum + product) == i) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
