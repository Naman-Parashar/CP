package Leet_Code.Easy;

public class _1572_Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int op = 0;
        int k = mat.length - 1;
        for (int i = 0; i < mat.length; i++)
        {
            op=op + mat[i][i] + mat[i][k--];
        }
        if(mat.length %2 != 0) {
            int x = mat.length/2;
            op-=mat[x][x];
        }
        return op;
    }
}
