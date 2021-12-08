/**
 * Created by lulu
 * Description:654. 最大二叉树
 * User: Administrator
 * Date: 2021-12-08
 * Time: 16:42
 */
public class TestDemo {
    public static void main(String[] args) {

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
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    public TreeNode build(int[] nums,int left,int right){
        if(left>right)return null;
        //纪录最大下标
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i = left;i <= right;i++){
            if(max<nums[i]){
                index = i;
                max = nums[i];
            }
        }

        TreeNode root = new TreeNode(max);
        root.left = build(nums,left,index-1);
        root.right = build(nums,index+1,right);
        return root;
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
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder,int pre,int end,int[] inorder,int left,int right){
        if(pre>end)return null;
        int rootVal = preorder[pre];
        int index = 0;
        for(int i = left;i <= right;i++){
            if(inorder[i] == rootVal){
                index = i;
                break;
            }
        }

        int Size = index - left;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(preorder,pre + 1,pre + Size ,inorder,left,index-1);
        root.right = build(preorder,pre + Size + 1,end,inorder,index + 1,right);
        return root;
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
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode build(int[] inorder,int pre,int end,int[] postorder,int left,int right){
        if(left>right)return null;

        int index = 0;
        int rootVal = postorder[right];
        for(int i = pre;i <= end ;i++){
            if(inorder[i] == rootVal){
                index = i;
                break;
            }
        }
        int Size = index - pre;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(inorder,pre,index-1,postorder,left ,left+Size-1);
        root.right = build(inorder,index+1,end,postorder,left+Size,right-1);
        return root;
    }
}