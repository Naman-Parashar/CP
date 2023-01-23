package Leet_Code.Easy;

public class _1588_Sum_of_All_Odd_Length_Subarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += ((int) Math.ceil((i + 1) * (n - i) / 2.0)) * arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,5,3};
        System.out.print( new _1588_Sum_of_All_Odd_Length_Subarrays().sumOddLengthSubarrays(arr));
    }
}
