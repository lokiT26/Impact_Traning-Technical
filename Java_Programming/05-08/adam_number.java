// Find whether the given number is Adam or Not. The square of the given number is equal to the reverse of the square of the reverse of the given number. 
// For example, Consider the input 12. Square(12)=144 and Reverse (Square (Reverse (12)))=144

import java.util.Scanner;

public class adam_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int num_square = num * num;
        System.out.println("square of num: "+ num_square);
        int rev = 0;
        
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        int rev_square = rev * rev;
        int rev_rev_square = 0;
        System.out.println("reverse num: "+ rev);
        System.out.println("square of reverse num: "+ rev_square);

        while(rev_square != 0){
            int digit = rev_square % 10;
            rev_rev_square = rev_rev_square * 10 + digit;
            rev_square /= 10;
        }

        if (rev_rev_square == num_square){
            System.out.println("Adam Number");
        } else{
            System.out.println("Not Adam Number");
        }

        sc.close();
    }
}
