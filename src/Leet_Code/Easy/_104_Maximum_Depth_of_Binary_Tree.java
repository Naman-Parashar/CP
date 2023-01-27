package Leet_Code.Easy;
//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
public class _104_Maximum_Depth_of_Binary_Tree {
    public static int height(TreeNode root){
        if (root == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh);
    }
}
