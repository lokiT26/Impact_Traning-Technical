// You are playing an online game. In the game, a list of N numbers is given. The player has to arrange the numbers so that all the odd numbers on the list come after the even numbers. Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.

// Input Format
// The first line of the input consists of an integer num, representing the size of the list(N). The second line of the input consists of N space-separated integers representing the values of the list.

import java.util.Scanner;

public class online_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0, right = n - 1;
        while(left < right){
            if(arr[left] % 2 != 0){
                if(arr[right] % 2 == 0){
                    int temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                    left++;right--;
                } else{
                    right--;
                }
            } else{
                left++;
            }
        }
        System.out.println("Array after Segregation");
        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
