/**
 * Created by lulu
 * Description:循环队列
 * User: Administrator
 * Date: 2021-10-05
 * Time: 23:09
 */
public class MycircleQueue {
    private int[] elem;
    private int usedSize;
    private int front;
    private int rear;

    public MycircleQueue(int n){
        this.elem = new int[n];
    }

    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1)%this.elem.length;
        return true;
    }

    public boolean isFull(){
        if((this.rear+1)%this.elem.length == this.front){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(this.front == this.rear)return true;
        return false;
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }

    //peek()
    public int Front(){
        if(isEmpty()){
            return -1;
        }
        int val = this.elem[this.front];
        return val;
    }

    public int Rear(){
        if(isEmpty())return -1;
        if(this.rear==0){
            return this.elem[this.elem.length-1];
        }
        return this.elem[this.rear-1];
    }
}
