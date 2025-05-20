// Count the total number of Set bits in a number

import java.util.Scanner;

public class total_set_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count += 1;
            }
            n >>= 1;
        }
        System.out.println(count);

        sc.close();
    }    
}
