// Count the total number of substrings in a string
// A substring is a contiguous non-empty sequence of characters within a string.

import java.util.Scanner;

public class possible_substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length();
        int count = 0;
        // Print all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
                count++;
            }
        }
        System.out.println("Total substrings: " + count);
        // Formula: For a string of length n, total substrings = n * (n + 1) / 2
        sc.close();
    }
}
