package Leet_Code.Easy;

import java.util.HashMap;

//You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
public class _496_Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] op = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i],i );
            if(i < op.length) op[i] = -1;
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j =map.get(nums1[i])+1 ; j < nums2.length ; j++) {
                if(nums2[j] > nums1[i]){
                    op[i] = nums2[j];
                    break;
                }
            }
        }
        return op;
    }
}
