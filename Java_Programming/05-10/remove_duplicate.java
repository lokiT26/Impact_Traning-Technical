// Jack and John were investigating a murder and the murderer was Ms.Isha Adler. She wanted Jack to find her by solving the puzzles. Jack was able to solve all but one. The last task was to write a program to remove duplicate elements from an array. Can you help Jack?

import java.util.Scanner;

public class remove_duplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int i, j, flag;
            for(i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
        for(i = 0; i < n; i++){
            flag = 1;
            for(j = 0; j < i; j++){
                if(a[i] == a[j]){
                    flag = 0;
                }
            }
            if(flag == 1){
                System.out.println(a[i]);
            }
        }
        }
    }

}
