import java.util.HashMap;
import java.util.Scanner;

public class _4_Kevin_and_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        HashMap<Integer,Integer> m = new HashMap<>();
        
        while (t-- > 0){
            int l = sc.nextInt();
            int d = l/2;

            for (int j = 0; j < d; j++) {
                System.out.print((d+j+1)+" "+(j+1)+" ");
            }
            System.out.println((l%2 != 0) ? l :"");
        }
    }
}
