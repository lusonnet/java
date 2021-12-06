import javax.swing.tree.TreeNode;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-06
 * Time: 20:55
 */
public class TestDemo2 {
    /*public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public static void main(String[] args) {

    }
    ListNode reverse(ListNode a){
        ListNode pre,cur,net;
        pre = null;
        cur = a;
        net = a;
        while(cur != null){
            net = net.next;
            cur.next = pre;
            pre = cur;
            cur = net;
        }
        return pre;
    }*/


}


/* //Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}*/

