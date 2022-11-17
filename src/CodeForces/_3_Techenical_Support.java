import java.util.Scanner;

public class _3_Techenical_Support {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0){
            int n = s.nextInt();
            char[] st = s.next().toCharArray();
            int count  = 0;
            for (int i = 0; i < n; i++) {
                if (st[i] == 'Q') count++;
                else count--;
//                if (count < 0) count = 0;
            }
            if (count <= 0) System.out.println("Yes");
            else System.out.println("No");
            t--;
        }
    }
}
