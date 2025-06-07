// Implement the following function:
// Int PlayList(int airTime, int songs, int n);
// The function accepts a positive integer 'airTime' and a positive integer array 'songs' of size 'n' as its argument. 'songs' consists of length of songs (in minutes). A radio jockey has to playlists of combination of exactly thre songs such that the total length of playlists is equal to 'airtime' (in minutes). Implement the function to find the count of playlist that can be find and return the same.

import java.util.Arrays;

public class radio_jockey {
    private static int PlayList(int airTime, int songs[], int n){
        Arrays.sort(songs);
        int count = 0;
        for(int i = 0; i < n - 2; i++){
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                int sum = songs[i] + songs[j] + songs[k];
                if(sum == airTime){
                    count++;
                    System.out.println(songs[i] + " " + songs[j] + " " + songs[k]);
                    j++;
                    k--;
                    // Skip duplicates
                    while(j < k && songs[j] == songs[j - 1]) j++;
                    while(j < k && songs[k] == songs[k + 1]) k--;
                } else if(sum < airTime){
                    j++;
                } else{
                    k--;
                }
            }
            // Skip duplicates
            while(i + 1 < n - 2 && songs[i] == songs[i + 1]) i++;
        }
        return count;
    }
    public static void main(String[] args) {
        // int airTime = 18;
        // int[] songs = {3, 5, 4, 10, 2, 1, 8, 7, 12};
        int airTime = 40;
        int[] songs = {7, 14, 21, 19, 17, 2, 29, 5};
        int n = songs.length;
        System.out.println(PlayList(airTime, songs, n));
    }
}
