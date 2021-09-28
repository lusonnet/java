/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-28
 * Time: 23:07
 */

class Node{
    public char val;
    public Node left;
    public Node right;

    public Node(char val){
        this.val = val;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Tree testtree = new Tree();
        Node root = testtree.createTree();//生成树
        testtree.preOrder(root);
        System.out.println();
        testtree.middleOrder(root);
        System.out.println();
        testtree.afterOrder(root);
        System.out.println();
    }

}

/*class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        list.add(root.val);

        List<Integer> leftTree = preorderTraversal(root.left);
        list.addAll(leftTree);
        List<Integer> rightTree = preorderTraversal(root.right);
        list.addAll(rightTree);

        return list;
    }
}*/
