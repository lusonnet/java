/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-10
 * Time: 20:14
 */

import java.util.HashMap;
import java.util.*;

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

public class TestDemo {
    HashMap<String,Integer> map= new HashMap<>();
    LinkedList<TreeNode> list = new LinkedList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        reverse(root);
        return list;
    }

    public String reverse(TreeNode root){
        if(root == null)return "#";
        String left = reverse(root.left);
        String right = reverse(root.right);
        String sub = left + "，" + right + "，" + root.val;
        int fre = map.getOrDefault(sub,0);
        if(fre == 1){
            list.add(root);
        }
        map.put(sub,fre+1);
        return sub;
    }
}
