// Given an integer n, return a string array answer (1-indexed) where:
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> answer = new ArrayList<>(n);
        if(n == 0) System.exit(0);
        for(int i = 1; i <= n; i++){
            if(i % 5 == 0 && i % 3 == 0) answer.add("FizzBuzz");
            else if(i % 3 == 0) answer.add("Fizz");
            else if(i % 5 == 0) answer.add("Buzz");
            else answer.add(String.valueOf(i));
        }
        System.out.println(answer);
        sc.close();
    }
}
