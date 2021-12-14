/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-14
 * Time: 21:45
 */
public class TestDemo {

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
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int leftH = findNode(root.left);
        if(leftH + 1 == k){
            return root.val;
        }else if(leftH >= k){
            return kthSmallest(root.left, k);
        }else{
            return kthSmallest(root.right, k-leftH-1);
        }

    }

    public int findNode(TreeNode root){
        if(root == null)return 0;
        return findNode(root.left)+findNode(root.right)+1;
    }

}
