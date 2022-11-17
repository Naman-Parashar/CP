package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class SwapGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();

        while (t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)  arr[i] = sc.nextInt();

            Arrays.sort(arr,1,n);
            if(arr[0] <= arr[1]) System.out.println("Bob");
            else System.out.println("Alice");
            t--;
        }
    }
}
