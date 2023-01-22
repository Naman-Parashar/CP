import java.util.*;
public class test {
    public static void main(String[] args) {
        int n = 4009;
        int i = 0;
        int arr[] = new int[4];
         while (n > 0){
            int x = n %10;
            arr[i]=x;
            i++;
            n = n /10;
        }
        Arrays.sort(arr);
         int a  = arr[0]* 10 + arr[arr.length-1];
        int b  = arr[1]* 10 + arr[arr.length-2];
        System.out.println(a+b);
    }
}
