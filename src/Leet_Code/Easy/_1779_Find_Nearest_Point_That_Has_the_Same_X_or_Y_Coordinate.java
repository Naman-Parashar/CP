package Leet_Code.Easy;

public class _1779_Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate {

    public int manDis(int x1 ,int y1 , int x2 , int y2){
        return (Math.abs(x2-x1)+Math.abs(y2-y1));
    }

    public boolean isValid(int[] q,int x, int y){
        if(q[0] ==x || q[1] == y) return true;
        else return false;
    }
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDis = Integer.MAX_VALUE;
        int op = -1;
        for (int i = 0; i <points.length ; i++) {
            if(isValid(points[i],x,y)){
                int d = manDis(x,y,points[i][0],points[i][1]);
                if(d < minDis) {
                    minDis = d;
                    op = i;
                }
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{2,3}};
        System.out.println(new _1779_Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate().nearestValidPoint(3,4,arr));
    }
}
