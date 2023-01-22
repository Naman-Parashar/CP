package Leet_Code.Easy;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class _589_N_ary_Tree_Preorder_Traversal {
    List<Integer> result = new ArrayList<>();

//      Recursive Solution
//    public List<Integer> preorder(Node root) {
//        if (root == null) return result;
//        result.add(root.val);
//
//        for (Node child : root.children) {
//            preorder(child);
//        }
//        return result;
//    }


    // Iterative Solution
    public List<Integer> preorder(Node root){
        if (root == null) return result;

        // note type bcz further i need to traverse the child list
        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()){
            Node curr = st.pop();
            result.add(curr.val);

            for (int i = curr.children.size()-1 ; i >=0 ; i--){
                st.push(curr.children.get(i));
            }
        }
        return result;
    }
}
