// Joey Tribbiani wanted to buy a meatball Sandwich and went to the nearby sandwich shop. There was a poster that said if anyone comes up with a program for Trendy Number they can get free Sandwiches for a lifetime as a gift. Can you help Joey to write a program to check whether the given number is a trendy number or not?
// A number is sald to be a trendy number if it has 3 digits and the middle digit is divisible by 3.

import java.util.Scanner;

public class trendy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 99 && number < 1000){
            int secondDigit = (number / 10) % 10;
            if (secondDigit % 3 == 0){
                System.out.println("Trendy Number");
            } else {
                System.out.println("Not a Trendy Number");
            }
        } else{
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}
