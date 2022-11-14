import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {
        int[] arr = {1,172,75,771,231,121,64,509,63,283,62,198,70,518,322,55,58,1491,704,1232,367,344,278,7,9,206,876,122,2,134,239,45,300,202,72,1143};
        Arrays.sort(arr);
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(arr.length);
    }
}
