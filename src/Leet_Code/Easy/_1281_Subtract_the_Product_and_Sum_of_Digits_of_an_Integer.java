package Leet_Code.Easy;

public class _1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;
        while (n>0){
            int x = n%10;
            p *=x;
            s+=x;
            n=n/10;
        }
        return (p-s);
    }
}
