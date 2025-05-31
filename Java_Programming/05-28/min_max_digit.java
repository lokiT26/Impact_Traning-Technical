// Find the Minimum and Maximum digit from a number.

import java.util.Scanner;

public class min_max_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        min_and_max(num);

        sc.close();
    }

    private static void min_and_max(int num){
        if(num == 0){
            System.out.print("Min: "+0 +"\nMax: "+0);
            return;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while(num != 0){
            int digit = num % 10;
            if(digit < min)
            min = digit;
            if(digit > max)
            max = digit;
            num /= 10;
        }

        System.out.print("Min: "+min +"\nMax: "+max);
    }
}
