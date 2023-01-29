package Leet_Code.Easy;

public class _303_Range_Sum_Query_mmutable {
    int[] nums;
    public _303_Range_Sum_Query_mmutable(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
