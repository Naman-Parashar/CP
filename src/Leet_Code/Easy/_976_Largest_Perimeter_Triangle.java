package Leet_Code.Easy;
import java.util.Arrays;

public class _976_Largest_Perimeter_Triangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int op= 0;
        for (int i = nums.length-1; i >1 ; i--) {
            if((nums[i-2] + nums[i-1]) > nums[i]) {
                op = nums[i-2] + nums[i-1] + nums[i];
                break;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,3,3,4};
        largestPerimeter(a);
     }
}
