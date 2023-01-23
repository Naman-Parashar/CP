package Leet_Code.Easy;

public class _1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] a : accounts){
            int sum = 0;
            for (int x : a){
                sum+=x;
            }
            if(sum > max) max = sum;
        }
        return max;
    }
}
