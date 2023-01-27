package Leet_Code.Easy;

import java.util.Arrays;

public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i< nums.length; i++){
        //     if(map.containsKey(nums[i])) return true;
        //     map.put(nums[i],i);
        // }
        // return false;
    }
}
