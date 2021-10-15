import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-15
 * Time: 19:14
 */

class BiTreeNode {

    String value; //结点值
    BiTreeNode left; //左子树根节点
    BiTreeNode right; //右子树根节点

    public BiTreeNode(String value) { //构造方法
        this.value = value;
    }

}

public class TestDemo {

    public static void levelOrder(BiTreeNode root) {
        if (root == null) return;
        Queue<BiTreeNode> q = new LinkedList<>();
        BiTreeNode cur;
        q.offer(root);
        while(!q.isEmpty()){
            cur = q.poll();
            System.out.println(cur.value);
            if(cur.left!=null)q.offer(cur.left);
            if(cur.right!=null)q.offer(cur.right);
        }

    }
    public static void main(String[] args) {
        //创建二叉树
        BiTreeNode t = new BiTreeNode("A");	//根节点A
        t.left = new BiTreeNode("B");	//A的左子树
        t.right = new BiTreeNode("C");	//A的右子树
        t.left.left = new BiTreeNode("D");	//B的左子树
        t.left.left.right = new BiTreeNode("G");	//D的右子树
        t.right.left = new BiTreeNode("E");	//C的左子树
        t.right.right = new BiTreeNode("F");	//C的右子树

        levelOrder(t);


    }

}
