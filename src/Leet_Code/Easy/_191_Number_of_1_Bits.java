package Leet_Code.Easy;

public class _191_Number_of_1_Bits {
    public int hammingWeight(int n) {
//        int ans=0;
//        while(n!=0)
//        {
//            ans=ans+(n%2);
//            n=n/2;
//        }
//        return ans;

        int s =1;
        int c =0;
        for(int  i= 0 ; i<32; i++){
            int x  = n&s;
            if(x != 0) c++;
            s = s<<1;
        }
        return c;
    }
}
/*     1011
    s  0001

ans    0001  (not = zero) counter++
now shift s by 1; s = 0010

now peform and again

    1011
    0010

ans 0010  (not = zero) counter++

     1011
     0100

ans  0000  ( = to zero no increment)


 */