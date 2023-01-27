import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0){
            int len = sc.nextInt();
            String str = sc.next();
            int o = 0;
            int p =0 ;
            int m = 0;
            int j=0;
            while (j<len && str.charAt(j) == '1'){
                p++;
                j++;
            }
            for (int i = j; i <len ; i++) {
                if (str.charAt(i) == '1') o++;
                else {
                    m = Math.max(m, o);
                    o = 0;
                }
            }
            m = Math.max(m, o);
            System.out.println(m + p);
        }
    }
}
