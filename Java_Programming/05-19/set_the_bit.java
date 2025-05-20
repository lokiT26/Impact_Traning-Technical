// Set the ith bit of given integer

import java.util.Scanner;

public class set_the_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = sc.nextInt();

        num = (num | (1 << index));
        System.out.println(num);

        sc.close();
    }
}
