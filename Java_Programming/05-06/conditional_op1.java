//Given an integer, n, perform the following conditional actions:
    // If n is odd, print Weird
    // If n is even and in the inclusive range of 2 to 5, print Not Weird
    // If n is even and in the inclusive range of 6 to 20, print Weird
    // If n is even and greater than 20, print Not Weird

import java.util.Scanner;

public class conditional_op1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            if (number < 6 && number > 1){
                System.out.println("Not Weird");
            }
            else if (number < 21 && number > 5){
                System.out.println("Weird");
            }
            else if (number > 20){
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}