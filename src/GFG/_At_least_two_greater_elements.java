package GFG;

import java.util.Arrays;

public class _At_least_two_greater_elements {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here
        Arrays.sort(a);
        long[] op = new long[a.length-2];
        for (int i = 0; i < op.length; i++) {
            op[i] = a[i];
        }
        return op;
     }
}
