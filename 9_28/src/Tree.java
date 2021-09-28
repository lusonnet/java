/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-28
 * Time: 23:07
 */
public class Tree {
    public Node createTree(){
        //手动生成二叉树
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');


        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;

    }

    void preOrder(Node root){//前序遍历
        if(root==null){
            return ;
        }
        System.out.print(root.val+" ");//根
        preOrder(root.left);//左
        preOrder(root.right);//右
    }

    void middleOrder(Node root){//中序遍历
        if(root==null){
            return ;
        }
        middleOrder(root.left);//左
        System.out.print(root.val+" ");//根
        middleOrder(root.right);//右
    }

    void afterOrder(Node root){//后序遍历
        if(root==null){
            return ;
        }
        afterOrder(root.left);//左
        afterOrder(root.right);//右
        System.out.print(root.val+" ");//根
    }
}
