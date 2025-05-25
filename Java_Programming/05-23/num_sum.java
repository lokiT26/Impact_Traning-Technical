// A game has to be played by Varun whereas he is not supposed to take the characters into account. His task is to add the numbers given in a string containing alphanumeric characters. If he adds the character values he will die. Help him to win the game by writing a program to print the sum of numbers
// Sample Input:
// 1abc23
// Sample Output:
// 24

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class num_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println("Sum: " + sum1(s));
        System.out.println("Sum: " + sum2(s));
        sc.close();
    }

    // Approach 1:
    private static int sum1(String str){
        int sum=0;
        int prev=0;
        for(int i=0;i<str.length();i++){
            
            if(Character.isDigit(str.charAt(i))){
                
                int n = str.charAt(i) - '0';
                
                n=prev*10+n;
                prev=n;
            }else{
                sum=prev+sum;
                prev=0;
                
            }
        }sum=prev+sum;
        return sum;
    }

    // Approach 2:
    private static int sum2(String str){
        Pattern pattern = Pattern.compile("\\d+"); // Match one or more digits
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        while (matcher.find()) {
            String numStr = matcher.group();
            // System.out.println(numStr); // Print each number found
            sum += Integer.parseInt(numStr);
        }
        return sum;
    }
}