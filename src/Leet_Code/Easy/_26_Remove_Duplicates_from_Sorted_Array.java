package Leet_Code.Easy;
import java.util.ArrayList;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            Integer j= nums[i];
            if (!a.contains(j)){
                a.add(j);
            }
        }
        for (int i = 0; i < a.size(); i++) {
            nums[i] = a.get(i);
        }
        return a.size();
    }


    // optimise
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        int j=1;
        while (j<nums.length){
            if (nums[i] == nums[j]){
                j++;
            }
            else{
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]= temp;
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
       int op =removeDuplicates(arr);
        System.out.println(op);
    }
}
