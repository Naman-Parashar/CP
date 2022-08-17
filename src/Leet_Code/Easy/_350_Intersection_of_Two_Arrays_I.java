package Leet_Code.Easy;

import java.util.Arrays;

public class _350_Intersection_of_Two_Arrays_I {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] arr;
        int q = 0 , i =0 , j=0 ,l =0;;
        if(nums1.length<nums2.length){
            arr = new int[nums1.length];
            // l=nums1.length;
        }
        else{
            arr = new int[nums2.length];
            // l = nums2.length;
        }

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                arr[q++] = nums1[i];
                i++;
                j++;
            }
        }
        arr = Arrays.copyOfRange(arr,0,q);
        return arr;
    }
}
