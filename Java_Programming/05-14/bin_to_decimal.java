// Program to Convert Binary number to Decimal Number

import java.util.Scanner;

public class bin_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Binary Number: ");
        int bin_num = sc.nextInt();
        int dec_num = 0, place = 0;

        while(bin_num != 0){
            int digit = bin_num % 10;
            if (digit != 0){
                dec_num += (int)Math.pow(2, place);
            }
            bin_num /= 10;
            place++;
        }
        System.out.println("Decimal Number: "+ dec_num);
        sc.close();
    }    
}
