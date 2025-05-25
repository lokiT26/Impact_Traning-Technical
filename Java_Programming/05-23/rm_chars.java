// Remove all characters in Second String that are present in First String

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class rm_chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(result(str1, str2));
        // System.out.println(str2.replaceAll("[" + str1 + "]", ""));
        sc.close();
    }

    public static String result(String str1, String str2) {
        if (str1 == null || str2 == null) return str2;
        
        Set<Character> charsToRemove = new HashSet<>();
        for (char c : str1.toCharArray()) {
            charsToRemove.add(c);
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : str2.toCharArray()) {
            if (!charsToRemove.contains(c)) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}