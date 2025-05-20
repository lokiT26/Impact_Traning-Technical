// Clear the set bit of a number

import java.util.Scanner;

public class clear_set_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = sc.nextInt();

        int a = 1 << index;
        num &= ~a;
        System.out.println(num);

        sc.close();
    }    
}
