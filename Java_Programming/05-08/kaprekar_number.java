// Jaffer wanted to excel in Math. He was learning about the Kaprekar number from Meena, his Maths teacher. She gave him a few random numbers and asked him to find out whether they are Kaprekar number or not.
// (Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since 9^2 = 81 & 8 + 1 = 9, similarly, 297 is a Kaprekar number as 297^2 = 88209 & 88 + 209 = 297 ).
// Can you help Jaffer to write a program to find whether the given number is a Kaprekar number or not?

import java.util.Scanner;

public class kaprekar_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int temp1 = num;
        int digit_count = 0;

        while(temp1 > 0){
            temp1 /= 10;
            digit_count++;
        }

        int pow = (int)Math.pow(10, digit_count);
        int right_part = square % pow;
        int left_part = square / pow;
        System.out.println("Square: "+ square);
        System.out.println("Right part: "+ right_part);
        System.out.println("Left part: "+ left_part);

        if((left_part + right_part) == num){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }

        sc.close();
    }
}
