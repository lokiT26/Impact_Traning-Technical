// Arjuna and Karna were playing cards. Arjuna has 5 cards. Karna wants to insert a new card in between Arjuna's cards. Karna wants to find the position to insert the card. So help him to find the position to insert a certain card. If Karna inserts a card in a position other than the position of 5 cards, the game will be over. So play carefully.

// For example, consider an array having three elements in it initially and a[0] = 1, a[1] = 2 and a[2] = 3 and you want to insert a number 45 at location 1 i.e. a[0] = 45, so we have to move elements one step below after insertion a[1] = 1, and a[2] = 2 and a[3] = 3.

import java.util.Scanner;

public class array_insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        if (index > n || index < 1){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int value = sc.nextInt();
        for (int i = 0; i < n; i++){
            if(i == index-1){
                System.out.println(value);
            }
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
