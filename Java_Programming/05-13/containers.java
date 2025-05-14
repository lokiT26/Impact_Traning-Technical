// An oil factory has N number of containers and each has a different capacity. During renovation, the manager decided to make some changes with the containers. He wishes to make different pairs for the containers in such a way that in the first pair, the container of maximum capacity is paired with the container of minimum capacity, and so on for the rest of the containers, to maintain a balance throughout all the pairs of containers.
// Write an algorithm to make different pairs of containers in such a way that the first container in the pair is of maximum capacity and second container in the pair is of minimum capacity.
// Output Format:
// Print K lines consisting of two space-separated integers representing the pairs that will be formed to maintain the balance by pairing the container of maximum capacity with the container of minimum capacity and so on.
// Note:
// If only one container is left and no pair is possible then print the capacity of that container and the second value will be '0'.


import java.util.Arrays;
import java.util.Scanner;

public class containers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x = n-1;
        for(int i = 0; i < (n/2); i++){
            System.out.println(arr[x--]+" "+arr[i]);
        } if (n % 2 != 0){
            System.out.println(arr[x--]+" 0");
        }
        sc.close();
    }
}
