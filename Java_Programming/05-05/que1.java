// Write a program to find the sum of the first and last digit of a number.
// For example, if the number is 1234, the output should be 5 (1 + 4 = 5).

import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int result = (n / 1000) + (n % 10);
        System.out.println(result);
        scanner.close();
    }
}