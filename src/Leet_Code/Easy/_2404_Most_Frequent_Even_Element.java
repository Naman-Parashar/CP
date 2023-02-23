package Leet_Code.Easy;

import java.util.HashMap;

public class _2404_Most_Frequent_Even_Element {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0) {
               if(!map.containsKey(nums[i])) map.put(nums[i],1);
               else map.put(nums[i],map.get(nums[i])+1);
            }
        }
        if (map.size() == 0) return -1;
        int count = -1;
        int num = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]) > count || (map.get(nums[i]) == count && nums[i] < num)) {
                    count = map.get(nums[i]);
                    num = nums[i];
                }
            }
        }
        return num;
    }
}
