// Check if given number is Even or Odd, without using modulo operator.

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        num &= 1;
        if(num == 0)
        System.out.println("Number is even.");
        else
        System.out.println("Number is odd.");
        
        sc.close();
    }   
}
