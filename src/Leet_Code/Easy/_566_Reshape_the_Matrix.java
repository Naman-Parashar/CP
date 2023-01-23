package Leet_Code.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _566_Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length) return mat;
        ArrayList<Integer> a = new ArrayList<>();
        int[][] op = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                a.add(mat[i][j]);
            }
        }

        int k =0;
        for (int i = 0; i < op.length; i++) {
            for (int j = 0; j < op[i].length; j++) {
                if(k < a.size()){
                    op[i][j] = a.get(k);
                }
                k++;
            }
        }
        return op;

                                 // or

//        if(mat.length*mat[0].length!=r*c) return mat;
//        int[][] arr=new int[r][c];
//        for(int i = 0; i < c*r; i++){
//            arr[i/c][i%c] = mat[i/mat[0].length][i%mat[0].length];
//        }
//        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2},{3,4}};
        int[][] op = matrixReshape(arr,2,4);
        for (int[] x: op){
            for (int w : x){
                System.out.print(w+" ");
            }
            System.out.println();
        }
    }
}
