import java.util.Scanner;

public class SelectionSort{

    private static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1 ; i++){
            int minIdx  = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}