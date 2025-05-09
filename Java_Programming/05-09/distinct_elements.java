// Harish and Rajesh were developing a plan to find the ideal woman for Sheldon Cooper. There were puzzles, translations, and questions to check a person's intelligence. One such question was to come up with a program to count the number of distinct elements in an array. Harini is a postdoctoral researcher and a former graduate student of Caltech who is a huge fan of Sheldon's work and she wanted to impress Sheldon by writing a program to count the number of distinct element in an array. Can you help Harini?

import java.util.Arrays;
import java.util.Scanner;

public class distinct_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int count = 1;

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0; i < a-1; i++){
            if(arr[i] != arr[i+1]){
                count++;
            }
        }

        System.out.println("There are "+count+" distinct element in the array.");
        sc.close();
    }
}
