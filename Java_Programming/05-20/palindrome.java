// Check the string is Palindrome or not

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("Not palindrome");
                System.exit(0);
            }
            left++; right--; 
        }
        System.out.println("palindrome");

        sc.close();
    }    
}
