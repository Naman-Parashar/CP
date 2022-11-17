import java.util.*;

public class test {

    private static boolean isPrime(int n){
        if( n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n %2 == 0 || n % 3 == 0 ) return false;

        for (int i = 5; i*i <= n ; i = i+6) {
            if (n % i == 0 || (n% (i+2)) == 0) return false;
        }
        return true;
    }
    public static void main (String[] args) throws java.lang.Exception{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0){
            int n = s.nextInt();
            int k = s.nextInt();

            int q = -1;
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt(); 
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == k){
                    q = i;
                    break;
                }
            }
            if (n == 1 && q != -1) System.out.println("Yes");
            else if (q != -1 && q != n-1) System.out.println("Yes");
            else System.out.println("No");
                t--;
        }
        HashMap<Integer,Integer> m = new HashMap<>();
        Collection<Integer> c = m.values();
        boolean p = true;
        for (Integer q : c) {
            if (q > 2) p = false;
        }
        if (p) System.out.println("Yes");
        else System.out.println("No");

    }
}
