/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-08
 * Time: 22:04
 */

class Node{
    public int val;
    public Node left;
    public Node right;

    public Node(char val){
        this.val=val;
    }
}

public class Tree {
    //构造二叉树（小白版）
    public Node buildTree(){
        Node A=new Node('A');
        Node B=new Node('B');
        Node C=new Node('C');
        Node D=new Node('D');
        Node E=new Node('E');
        Node F=new Node('F');
        Node G=new Node('G');
        Node H=new Node('H');
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        E.right=H;
        return A;
    }

    //求二叉树结点数
    //1.递归思路
    public static int count = 0;
    public void getSize(Node root){
        if(root==null){
            return;
        }
        count++;
        getSize(root.left);
        getSize(root.right);
    }
    //2.子问题思路
    public int getSize1(Node root){
        if(root==null){
            return 0;
        }
        return getSize1(root.left)+getSize1(root.right)+1;
    }

    //求第k层节点数
    int getKSize(Node root,int k){
        if(root == null){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        return getKSize(root.left,k-1)+getKSize(root.right,k-1);
    }


    //求树的高度
    //求左树高度和右树高度，其中取最大值，最大值+1即为树的高度
    int getHeight(Node root){
        if(root == null){
            return 0;
        }
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        return Math.max(leftH,rightH)+1;
    }

    //查找val
    Node find(Node root,char val){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        Node ret = find(root.left,val);//查找左子树
        if(ret!=null){
            return ret;
        }
        ret = find(root.right,val);//查找右子树
        if(ret!=null){
            return ret;
        }
        return null;
    }
}
