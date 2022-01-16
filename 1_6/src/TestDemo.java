/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2022-01-06
 * Time: 15:55
 */
public class TestDemo {

}

class MinStack {

    /** initialize your data structure here. */
    private Node head;
    Stack<Integer> s1 = new Stack<>();
    public MinStack() {

    }

    public void push(int x) {
        if(head == null){
            head = new Node(x,x,null);
        }else{

        }
    }

    public void pop() {

    }

    public int top() {

    }

    public int min() {

    }

    private class Node{
        int val;
        int min;
        Node next;

        public Node(int val,int min,Node next){
            this.min = min;
            this.next = next;
            this.val = val;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */