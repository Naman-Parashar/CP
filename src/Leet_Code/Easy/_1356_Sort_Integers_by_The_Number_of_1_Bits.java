package Leet_Code.Easy;

import java.util.Arrays;

public class _1356_Sort_Integers_by_The_Number_of_1_Bits {
//    public int[] sortByBits(int[] arr) {
//        for ( int i =0 ;i< arr.length ;i++){
//            arr[i] += Integer.bitCount(arr[i])*10001;
//        }
//        Arrays.sort(arr);
//        for ( int i =0 ;i< arr.length ;i++){
//            arr[i] = arr[i] %10001;
//        }
//        return arr;
//    }

    // method two
    public int[] sortByBits(int[] arr) {
        // 1. Counting oneBits of each element and storing them in an array
        Arrays.sort(arr);
        if(arr.length<=2) return arr;

        int [] bits=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            bits[i]=Integer.bitCount(arr[i]);
        }

        // 2. Now we'll put those bits in another array so that it can be represented in correct order in decimal form.
        int [] result=new int[bits.length];
        int a=0;
        for(int i=0; i<=14; i++){
          /* since the constraints are 0 <= arr[i] <= 10000.As 10000 in binary is 10011100010000 \U0001f611 The problem is
          if 10000 is present in an array it's binary size may be greater than the actual array size like in this case :
          arr=[10,100,1000,10000] , the size of arr=4 but the size of its element 100000 in binary=14.Hope so you also have understood this stupid case. */
            for(int j=0; j<bits.length; j++){
                if(bits[j]==i)
                    result[a++]=arr[j];// Some of you might be confused by seeing arr[j] here.
                /* Since we have sorted the array above therefore elements of arr will correspond to the element of  "bits" array. for example if arr[3]=3 then bits[3]=2 // means representing the bits of 3.*/
            }
        }
        return result;
    }
}
