package Leet_Code.Easy;

public class _283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int i= 0;
        int j = 1;
        while (j < nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            } else if (nums[i] == 0 && nums[j]==0) {
                j++;
            } else{
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        new _283_Move_Zeroes().moveZeroes(arr);
        for (int a : arr){
            System.out.print(a+" ");
        }
    }
}
