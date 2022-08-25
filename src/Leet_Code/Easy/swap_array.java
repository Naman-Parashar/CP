package Leet_Code.Easy;

public class swap_array {
    public static void swap(int[] nums , int n){
        int[] arr = new int[2*n];
//
//        for(int i = 0,j=0; j<n ; i+=2,j++) {
//            arr[i] = nums[j];
//        }
//        for(int i = 1,j=n; j<(2*n) ; i+=2,j++) {
//            arr[i] = nums[j];
//        }
//        for (int a : arr){
//            System.out.print(a+"  ");
//        }

        int i = 0;
        int j = n;
        int k= 0;
        while (k< arr.length){
            if (k%2 == 0) arr[k] = nums[i++];
            else arr[k] = nums[j++];
            k++;
        }
        for (int a : arr){
            System.out.print(a+"  ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        swap(arr,5);
     }
}
