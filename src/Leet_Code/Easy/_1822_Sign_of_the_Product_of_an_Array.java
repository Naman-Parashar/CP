package Leet_Code.Easy;

import java.util.Arrays;

public class _1822_Sign_of_the_Product_of_an_Array {
    public static int arraySign(int[] nums) {
        int p = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if ( nums[i] < 0) p++;
            if (nums[i] == 0) return 0;
        }
        if(p%2 == 0) return 1;
        else return -1;
    }
    public static void main(String[] args) {
        int[] a = new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        arraySign(a);
     }
}
