package Leet_Code.Easy;

import java.util.Arrays;

public class _1491_AverageSalaryExcludingtheMinimumandMaximum_Salary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int i = 1;
        int j = salary.length-1;
        double sum =0;
        while (i<j){
            sum += salary[i];
            i++;

        }
        sum = sum/(salary.length-2);
        return sum;
    }

    public static void main(String[] args) {
        int[] sal = {4000,3000,1000,2000};
        System.out.println(new _1491_AverageSalaryExcludingtheMinimumandMaximum_Salary().average(sal));
    }
}
