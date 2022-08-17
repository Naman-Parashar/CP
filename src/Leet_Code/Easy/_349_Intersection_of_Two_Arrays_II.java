package Leet_Code.Easy;

import java.util.Arrays;

public class _349_Intersection_of_Two_Arrays_II {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] arr= new int[Math.min(nums1.length, nums2.length)];
        int q = 0 , i =0 , j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                if(q==0){
                    arr[q] = nums1[i];
                    q++;
                    i++;
                    j++;
                }
                else{
                    if(arr[q-1] != nums1[i]) {
                        arr[q] = nums1[i];
                        q++;
                        i++;
                        j++;
                    }
                        i++;
                        j++;

                }
            }
        }
        arr = Arrays.copyOfRange(arr,0,q);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,6};
        int[] arr2 = {2,2};
       int[] arr3 = new  _349_Intersection_of_Two_Arrays_II().intersection(arr1,arr2);

       for (int s : arr3){
           System.out.println(s);
       }
    }
}
