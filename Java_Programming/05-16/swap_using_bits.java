// Swap two numbers without using third variable.

public class swap_using_bits {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
    
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        
        System.out.println("Num1: "+ num1+", Num2: "+ num2);
    }
}