// This program takes a three-digit number as input and reverses its digits.

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a nummber: ");
        int number = scanner.nextInt();
        
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;

        int reverseNumber = thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println("The reverse of " + number + " is " + reverseNumber);
        scanner.close();
    }
}
