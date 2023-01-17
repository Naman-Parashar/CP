package Leet_Code.Easy;

public class _2535_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public int differenceOfSum(int[] nums) {
        int eSum = 0;
        int dSum = 0;

        for (int i = 0; i < nums.length; i++) {
            eSum+=nums[i];
              dSum = dSum +digitSum(nums[i]);
        }
        return Math.abs(eSum - dSum);
    }
    private int digitSum(int n){
        int s =0;
        while (n > 0){
            int x = n%10;
            s+=x;
            n=n/10;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,15,6,3};
        new _2535_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array().differenceOfSum(arr);
    }
}
