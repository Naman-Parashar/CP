package Leet_Code;

import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0; i < nums.length ;i++){
            if(!map.containsKey((target-nums[i])) ){
                map.put(nums[i],i);
            }
            else {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        new twoSum().twoSum(arr,6);
    }
}
