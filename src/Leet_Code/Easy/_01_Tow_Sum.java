package Leet_Code.Easy;

public class _01_Tow_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i =0 ;i<nums.length;i++)
        {
            for(int j =i+1 ;j<nums.length;j++)
            {

                if(nums[i]+nums[j]==target)
                {
                    arr[0]= i;
                    arr[1]= j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int[] a = twoSum(arr,6);
        for (int r : a){
            System.out.print(r+" ");
        }
    }
}
