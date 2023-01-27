package Leet_Code.Easy;

public class _404_Sum_of_Left_Leaves {
    public int sumOfLeftLeaves(TreeNode r) {
        if (r == null) return 0;
        int sum = 0;
        if (r.left != null && r.left.left == null && r.left.right == null) sum += r.left.data;
        return sum + sumOfLeftLeaves(r.left) +sumOfLeftLeaves(r.right);
    }
}
