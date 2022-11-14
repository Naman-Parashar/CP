package Leet_Code.Easy;

import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left= right = null;
    }
}
public class _94_InorderTraversal {
    public static List<Integer> p(TreeNode root , List<Integer> l){
        if (root == null) return l;
       l= p(root.left,l);
        l.add(root.data);
       l= p(root.right,l);
        return l;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        return p(root,new ArrayList<>());
    }
}
