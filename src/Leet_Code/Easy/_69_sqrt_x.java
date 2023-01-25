package Leet_Code.Easy;

public class _69_sqrt_x {
    public int mySqrt(int x) {
        if (x < 2) return x;
        else {
            int start = 0;
            int end = x;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                long multiply = (long) mid * mid;
                if (multiply > x) {
                    end = mid - 1;
                } else if (multiply < x) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return end;
        }
    }
}
