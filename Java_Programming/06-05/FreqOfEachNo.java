import java.util.*;
public class FreqOfEachNo {
    public static void main(String[] args) {
        HashMap <Integer,Integer> obj=new HashMap<>();
        int arr[]={1,2,3,2,3,4,5,6,7,8,4,2,3,7};
        for (int i = 0; i < arr.length; i++) {
            
            if (obj.containsKey(arr[i])) {
                
                obj.put(arr[i], obj.get(arr[i]) + 1);
            } else {
                obj.put(arr[i], 1);
                
            }
        }
        System.out.println(obj);
    }
}