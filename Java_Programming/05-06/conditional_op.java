import java.util.Scanner;

public class conditional_op {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number < 10 || number > 99) {
            System.out.println("The number is not a two-digit number.");
            System.exit(0);
        } else {
            System.out.println("The number is a two-digit number.");
        }

        if (number<20){
            System.out.println("The number is less than 20.");
        }
        else{
            System.out.println("The number is greater than or equal to 20.");
        }

        if (number%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }

        scanner.close();
    }
}