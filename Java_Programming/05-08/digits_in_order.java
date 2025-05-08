// Print the digits of the given number, in the same order as they are in number.

import java.util.Scanner;

public class digits_in_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;

        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        while(rev != 0){
            System.out.println(rev % 10);
            rev /= 10;
        }

        sc.close();
    }
}
