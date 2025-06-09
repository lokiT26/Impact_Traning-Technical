// Print the numbers in ascending order (from 1 to n) with the help of Recursion.

public class recursion {
    public static void main(String[] args) {
        printNums(5);
    }
    
    static void printNums(int n){
        if(n == 0){
            return;
        }
        printNums(n - 1);
        System.out.print(n + " ");
    }
}
