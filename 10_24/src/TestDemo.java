import javax.swing.tree.TreeNode;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-25
 * Time: 21:35
 */


public class TestDemo {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }
    public TreeNode root;

    public TreeNode search(int key){
        TreeNode cur = root;
        while(cur!=null){
            if(cur.val==key){
                return cur;
            }else if(cur.val<key){
               cur = cur.right;
            }else{
                cur = cur.left;
            }
        }

        return null;
    }

    public boolean insertTree(int val) {
        if(root == null) {
            root = new TreeNode(val);
            return true;
        }
        TreeNode parent = null;
        TreeNode cur = root;
        while(cur!=null){
            if(cur.val<val){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
        TreeNode node = new TreeNode(val);
        if(parent.val<val){
            parent.right = node;
        }else{
            parent.left = node;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
