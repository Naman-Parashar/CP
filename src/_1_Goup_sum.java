import java.util.*;
public class _1_Goup_sum {
    private static long max(long[] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res+=arr[i];
        }
        return res < 0 ? res * (-1) : res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            System.out.println(max(arr));
            t--;
        }
    }
}
