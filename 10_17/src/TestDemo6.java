import java.util.Stack;

/**
 * Created by lulu
 * Description:二叉树
 * User: Administrator
 * Date: 2021-10-17
 * Time: 20:24
 */



public class TestDemo6 {




    /*public void recursionPostorderTraversal(TreeNode root){
        if(root==null)return;
        Node prev = null;
        Stack<Node> stack = new Stack<Node>();
        Node cur = root;
        while(cur!=null||!stack.empty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if(cur.right == null||cur.right==prev){
                stack.pop();
                System.out.println(cur.val+" ");
                prev = cur;
                cur = null;
            }else{
                cur = cur.right;
            }
        }

    }*/

    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {23,44,53,21,13,2,4,24,14,29};
        testHeap.creatBigHeap(array);
        testHeap.push(80);
    }

}

