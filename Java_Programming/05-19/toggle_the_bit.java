// Toggle the i'th bit of a number (if 1 then set 0, and if 0 then set 1)

import java.util.Scanner;

public class toggle_the_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = sc.nextInt();

        num ^= (1 << index);
        System.out.println(num);

        sc.close();
    }
}
