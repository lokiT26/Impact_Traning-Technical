// A bus stop queue has 'n' groups of people. The i-th group from the beginning has 'ai' people. Every 30 minutes an empty bus arrives at the bus stop, it can carry atmost 'm' people. Naturally, the people from the first group enter the bus first. Then goes the people from the second group and so on. Note that the order of groups in the queue never changes. Moreover, if some group cannot fit all of its members into the current bus, it waits for the next bus and joins with the other groups standing after them in the queue. Your task is to determine the number of buses needed to transport all 'n' groups to the Jeju Island countryside.

// Input Format
// The first line contains two integers n and m (1 ≤ n, m ≤ 100). The next line contains n integers: a1, a2, ..., an (1 ≤ ai ≤ m).

// Output Format
// Print a single integer — the number of buses needed to transport all n groups to the Jeju Island countryside.


import java.util.Scanner;

public class bus_queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0, bus_count = 0;
        for(int i = 0; i < n; i++){
            if(sum + arr[i] <= m){
                sum += arr[i];
            } else{
                bus_count++;
                System.out.println("Bus "+ (bus_count)+" occupancy: "+sum);
                sum = arr[i];
            }
        }
        System.err.println("Bus "+ (bus_count+1)+" occupancy: "+ sum);
        System.out.println("Total Buses: "+ (bus_count+1));
        sc.close();
    }
}
