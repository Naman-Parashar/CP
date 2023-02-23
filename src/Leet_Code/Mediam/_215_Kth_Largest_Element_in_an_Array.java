package Leet_Code.Mediam;

import java.util.*;

public class _215_Kth_Largest_Element_in_an_Array {
    public static void reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k-nums.length];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        System.out.println(arr.length);
        new _215_Kth_Largest_Element_in_an_Array().findKthLargest(arr,2);
    }
}
