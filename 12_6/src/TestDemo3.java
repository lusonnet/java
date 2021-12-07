/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-07
 * Time: 22:50
 */
public class TestDemo3 {
    public static void main(String[] args) {
        System.out.println("2021-12-7刷题");
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

/*class Solution {
    public Node connect(Node root) {
        if(root==null)return null;
        connectNode(root.left,root.right);
        return root;
    }

    void connectNode(Node a,Node b){
        if(a == null||b == null)return;
        a.next = b;
        connectNode(a.left,a.right);
        connectNode(b.left,b.right);
        connectNode(a.right,b.left);
    }
}*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*
class Solution {
    public void flatten(TreeNode root) {
        if(root == null)return;
        flatten(root.left);
        flatten(root.right);

        TreeNode a = root.left;
        TreeNode b = root.right;

        root.left = null;
        root.right = a;

        TreeNode p = root;
        while(p.right!=null){
            p = p.right;
        }
        p.right = b;

    }
}*/
