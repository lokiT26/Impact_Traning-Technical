// The Modern World Cinderella was happy to meet Prince Charming at the ballroom and she danced with him happily. While she was dancing, Prince wanted to check whether Cinderella is a perfect match for him. He asked her a question to check her knowledge of Arrays. Can you help Cinderella to write a program to find whether the two arrays are the same or not?
// Note: Two arrays are said to be the same if the sum of both arrays is the same and the size of the arrays is the same.

import java.util.Scanner;

public class same_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array A: ");
        int a = sc.nextInt();
        System.out.print("Enter size of array B: ");
        int b = sc.nextInt();
        int arr1[] = new int[a], arr2[] = new int[b];
        int sum1 = 0, sum2 = 0;

        for(int i = 0; i < a; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < b; i++){
            arr2[i] = sc.nextInt();
        }

        if (a == b){
            for(int i = 0; i < a; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
        } else{
            System.out.println("Not Same");
            System.exit(0);
        }

        if(sum1 == sum2){
            System.out.println("Same");
        } else{
            System.out.println("Not Same");
        }

        sc.close();
    }
}
