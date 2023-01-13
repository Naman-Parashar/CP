import java.util.*;
class Number{
    int x = 10;
}
public class test {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(arr.length == 1) return 1;
        long rs =0,ls=0;
        for(int i = 1 ; i< n ; i++){
            rs+=arr[i];
        }
        int i = 0,op=-1;
        while(i < n-1){
            if(rs == ls) {
                op =i+1;
                break;
            } else if (ls > rs) {
                return -1;
            } else{
                i++;
                ls+=arr[i-1];
                rs = rs-arr[i];
            }
        }
        return op;
    }
    public static void main(String[] args) {
        long arr[] = new long[]{4 ,42, 27, 16 ,28 ,3, 4, 5 ,9 ,3 ,31, 5 ,5 ,29, 10, 18 ,35 ,35 ,33, 19 ,41 ,23, 8 ,32 ,9 ,5, 8, 18,
                35 ,13 ,6 ,7 ,6 ,10 ,11 ,13, 37 ,2 ,25, 7 ,28, 43};
        System.out.println(equilibriumPoint(arr,42));
    }
}
