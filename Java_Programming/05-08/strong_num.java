// A number can be said as a strong number when the sum of the factorial of the individual digits is equal to the number.
// For example, 145 is a strong number. 1! + 4! + 5! = 145. Write a program to check whether a given number is a strong number or not.

import java.util.Scanner;

public class strong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while(temp > 0){
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }
        if (num == sum){
            System.out.println("Strong number");
        } else{
            System.out.println("Not Strong number");
        }
        sc.close();
    }

    public static int fact(int num){
        int factorial = 1;
        while(num > 1){
            factorial *= num;
            num--;
        }
        return factorial;
    }
}
