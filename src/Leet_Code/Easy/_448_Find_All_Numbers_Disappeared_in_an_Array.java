package Leet_Code.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i],true);
        }
        List<Integer> op = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++) {
           if(!map.containsKey(nums[i])){
               op.add(i);
           }
        }
        return op;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
     }
}
