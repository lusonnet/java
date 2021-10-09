/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-09
 * Time: 23:25
 */

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
/*class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)return 0;
        root.left = increasingBST(root.left);
        System.out.in
    }
}*/
public class TestDemo {
    public static void main(String[] args) {
        System.out.println();
    }
}

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
    TreeNode head = new TreeNode(0),pre = head;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)return null;
        increasingBST(root.left);//遍历左子树
        pre.right = root;//
        pre = pre.right;
        root.left = null;
        increasingBST(root.right);
        return head.right;
    }
}*/
