// Given a string s, find the length of the longest substring without duplicate characters.

import java.util.Scanner;

public class longest_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(s));
        sc.close();
    }

    private static int lengthOfLongestSubstring(String s) {
        String long_s = "";
        String f_long_s = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = long_s.indexOf(c);
            if (idx != -1) {
                if (long_s.length() > f_long_s.length()) {
                    f_long_s = long_s;
                }
                long_s = long_s.substring(idx + 1) + c;
            } else {
                long_s += c;
            }
        }
        if (long_s.length() > f_long_s.length()) {
            f_long_s = long_s;
        }
        return f_long_s.length();
    }

}
