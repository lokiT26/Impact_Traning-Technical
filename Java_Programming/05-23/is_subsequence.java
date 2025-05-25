// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

import java.util.Scanner;

public class is_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int x = 0, y = 0;
        while(t.length()> x && s.length() > y){
            if(t.charAt(x) != s.charAt(y)){
                x++;
            } else{
                x++; y++;
            }
        }
        if(y == s.length()){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        sc.close();
    }
}
