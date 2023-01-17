package Leet_Code.Easy;

public class _1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public double average(int[] salary) {
        double op = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < salary.length ; i++) {
            if (salary[i] > max) max=salary[i];
            if (salary[i]< min) min = salary[i];
            op+=salary[i];
        }
        op = op - (max+min);
        op = op/(salary.length-2);
        return op;
    }
}
