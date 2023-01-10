package CodeForces;

import java.util.Scanner;

public class _3_Techenical_Support {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();
            int x = s.nextInt();

            int year = 0;
            int days = 0;
            while (days<x){
                days += (n*(k-1));
                year = days/n;
                if (days > x)
                days= days + n+ m;
                if (year % k == 0 ) days +=m;
            }
            System.out.println(year);
//            if (year % k == 0 ) System.out.println("Yes");
//            else System.out.println("No");
        }
    }
}
