/**
 * Created by lulu
 * Description:树的基本题
 * User: Administrator
 * Date: 2021-10-11
 * Time: 17:11
 */
/*public class TestDemo {
    void postOrderTraversalNor(Node root){
        if(root == null) return;
        Node prev = null;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right已经被打印) {
                stack.pop();
                System.out.print(cur.val + " ");
                cur = null;// 这个y被打印了  不能再次入栈
            } else {
                cur = cur.right;
            }
        }

    }

}*/

/*
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null&&q!=null||p!=null&&q==null)return false;
        if(p==null&&q==null)return true;
        if(p.val!=q.val)return false;
        return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root ==null||subRoot==null)return false;
        if( isSameTree(root, subRoot))return true;
        if(isSubtree(root.left, subRoot))return true;
        if(isSubtree(root.right, subRoot))return true;
        return false;
    }
}*/

/*
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return leftHeight > rightHeight ? leftHeight+1:rightHeight+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.abs(leftHeight-rightHeight)<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
}*/
