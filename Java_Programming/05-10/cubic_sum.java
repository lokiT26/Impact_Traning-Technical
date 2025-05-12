/*You are given a function:
    Int isCubicSumExist(long long int A[], int N);
    The function accepts an array 'A' of size 'N' implement the function to return the count of good integers in array 'A'
    An integer Z is said to be good if and only if there exist two integers x and y such that x3 + y3 = z
*/

import java.util.Scanner;

class cubic_sum {
    // CODE 1: x, y and array's elements should be greater than 0.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int lb = 1;
            int ub = (int)Math.cbrt(arr[i]);

            while(lb<=ub){
                int cube_lb = (int)Math.pow(lb, 3);
                int cube_up = (int)Math.pow(ub, 3);
                int z = cube_lb + cube_up;
                if(z == arr[i]){
                    System.out.println(arr[i]+": "+ lb+" and "+ub);
                    count++;
                    break;
                }
                else {
                    if (z < arr[i]){
                        lb++;
                    }
                    else {
                        ub--;
                    }
                }
                
            }
        }
        System.out.println("Good Integers: "+ count);
        sc.close();

    }
    

    // CODE 2: x and y should be integers (can be positive and negative).

    // Function to check if a number can be expressed as sum of two cubes
    // private static boolean isGoodInteger(long num) {
    //     // Find approximate cube root limit
    //     int cubeRootLimit = (int) Math.cbrt(num) + 1;
        
    //     for (int x = -cubeRootLimit; x <= cubeRootLimit; x++) {
    //         long x_cubed = (long) x * x * x;
            
    //         // Skip if x^3 > num (when x is positive)
    //         if (x > 0 && x_cubed > num) continue;
            
    //         // Calculate what y^3 needs to be
    //         long y_cubed_needed = num - x_cubed;
            
    //         // Check if y^3 has an exact cube root
    //         double y_double = Math.cbrt(y_cubed_needed);
    //         long y = Math.round(y_double);
            
    //         // Check if y^3 matches what we need (allowing for small floating point errors)
    //         if (Math.abs(y * y * y - y_cubed_needed) < 1e-9) {
    //             System.out.println(num+": "+x+" and "+y);
    //             return true;
    //         }
    //     }
        
    //     return false;
    // }
    
    // // Function to count good integers in array
    // public static int isCubicSumExist(long[] A, int N) {
    //     int count = 0;
        
    //     for (int i = 0; i < N; i++) {
    //         if (isGoodInteger(A[i])) {
    //             count++;
    //         }
    //     }
        
    //     return count;
    // }
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     long[] A = new long[N];

    //     for(int i = 0; i < N; i++){
    //         A[i] = sc.nextLong();
    //     }
        
    //     int result = isCubicSumExist(A, N);
    //     System.out.println("Output: " + result);

    //     sc.close();
    // }
}