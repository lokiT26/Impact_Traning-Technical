import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)) return new int[] {map.get(comp), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}