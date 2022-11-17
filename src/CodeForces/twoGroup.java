package CodeForces;

import java.util.*;
public class twoGroup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            int n=sc.nextInt();
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=sc.nextLong();
            }
            System.out.println(Math.abs(sum));
        }
    }
}