// Problem statement
// You are provided with a number N. Count and print the number of integers x that follow the following conditions
// 1 ≤ x ≤ N
// X has odd number of digits

// Input format
// The input consists of a single line, The line contains a single integer denoting N

import java.util.Scanner;

public class count_odd_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 1; i <= n; i++){
            int temp = i;
            int digit_count = 0;

            while(temp != 0){
                temp /= 10;
                digit_count++;
            }

            if (digit_count % 2 != 0){
                count++;
            }

            digit_count = 0;
        }

        System.out.println(count);
        sc.close();

    }
}
