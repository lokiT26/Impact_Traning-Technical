// Find whether the given number is Adam or Not. The square of the given number is equal to the reverse of the square of the reverse of the given number. 
// For example, Consider the input 12. Square(12)=144 and Reverse (Square (Reverse (12)))=144
// DO IT USING FUNCTION.

import java.util.Scanner;

public class adam_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        
        System.out.println(isAdam(num));

        sc.close();
    }

    private static boolean isAdam(int num){
        int num_square = num * num;
        System.out.println("square of num: "+ num_square);
        int rev = reverse(num);
        int rev_square = rev * rev;

        int rev_rev_square = reverse(rev_square);
        System.out.println("reverse num: "+ rev);
        System.out.println("square of reverse num: "+ rev_square);

        if (rev_rev_square == num_square)
        return true;
        return false;
    }

    private static int reverse(int num){
        int rev = 0;
        
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return rev;
    }
}
