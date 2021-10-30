/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-28
 * Time: 18:37
 */
/*
public class TestDemo {
    public void remove(int key){
        TreeNode cur = root;
        TreeNode parent = null;
        while(cur!=null){
            if(cur.val<key){
                parent = cur;
                cur = cur.right;
            }else if(cur.val==key){
                removeNode(parent,cur);
                return;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
    }

    public void removeNode(TreeNode parent,TreeNode cur) {
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            TreeNode targetParent = cur;
            TreeNode target = cur.right;
            while(target.left!=null)
            {
                targetParent = target;
                target =target.left;
            }

            cur.val = target.val;
            if(targetParent.left == target){
                targetParent.left = target.right;
            }else{
                targetParent.right = target.right;
            }
        }
    }
}
*/
