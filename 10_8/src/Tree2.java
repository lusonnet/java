import java.util.Stack;

/**
 * Created by lulu
 * Description:非递归实现
 * 非递归实现也要使用树的遍历思想
 * User: Administrator
 * Date: 2021-10-08
 * Time: 22:50
 */
class Node1{
    public int val;
    public Node1 left;
    public Node1 right;

    public Node1(char val){
        this.val=val;
    }
}

public class Tree2 {
    //构造二叉树（小白版）
    public Node buildTree() {
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

    public void preOreder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();//出栈
            System.out.println(root.val+" ");
            if(root.right!=null){
                stack.push(root.right);
            }
            if(root.left!=null){
                stack.push(root.left);
            }
        }
    }

    //左子树-》根-》右子树
    public void middleOreder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        while(!stack.isEmpty() || root!=null){
            if(root!=null){
                stack.push(root);//将结点放进栈底
                root = root.left;//将左孩子进栈
            }else{
                root = stack.pop();
                System.out.println(root.val+" ");
                root = root.right;
            }

        }
    }

    public void afterOreder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            root = stack1.pop();//出栈
            stack2.push(root);
            if(root.right!=null){
                stack1.push(root.right);
            }
            if(root.left!=null){
                stack1.push(root.left);
            }
        }
        while(!stack2.isEmpty()){
            System.out.println(stack2.pop().val+" ");
        }

    }
}