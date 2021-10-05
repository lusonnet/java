/**
 * Created by lulu
 * Description:链表实现队列
 * User: Administrator
 * Date: 2021-10-05
 * Time: 22:12
 */

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
    }
}
public class MyQueue {
    private Node front;
    private Node rear;
    private  int usedSize;

    //入队列
    public void offer(int val){
        Node node = new Node(val);
        if(this.front == null){
            this.front = node;
        }else{
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize++;
    }

    //出对头
    public int poll() throws RuntimeException{

        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int val = this.front.data;
        if(this.front.next == null){
            this.front = this.rear = null;
        }else{
            this.front = this.front.next;
        }
        this.usedSize--;
        return val;
    }//

    //得到队头元素，不删除
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return this.front.data;
    }

    public boolean isEmpty(){
        return this.usedSize==0;
    }

    public int size(){
        return this.usedSize;
    }

}
