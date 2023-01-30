package Leet_Code.Easy;

public class _2022_Convert_1D_Array_Into_2D_Array {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length) return  new int[0][0];
        int[][] op = new int[m][n];
        for(int i =0 ; i < original.length;i++){
            op[i/n][i%n] = original[i];
        }
        return op;
    }
}
