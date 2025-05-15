// Program to Convert Decimal number to Binary number

import java.util.Scanner;

public class dec_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal Number: ");
        int dec_num = sc.nextInt();
        int bin_num = 0, rem, place = 1;

        while(dec_num != 0){
            rem = dec_num % 2;
            bin_num += rem * place;
            place = place * 10;
            dec_num /= 2;
        }
        System.out.println("Binary Number: "+ bin_num);
        sc.close();
    }
}
