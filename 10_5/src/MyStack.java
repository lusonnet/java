import java.util.Arrays;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-05
 * Time: 20:11
 */
public class MyStack {
    public int[] elem;
    public int usedSize;

    public MyStack(){
        this.elem = new int[10];

    }
    public boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }
        return false;
    }

    public void push(int item){
        if(isFull()){
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = item;
        this.usedSize++;
    }

    public boolean empty(){
        return this.usedSize == 0;
    }

    public int pop() throws RuntimeException{
        if(empty()){
            throw new RuntimeException("栈空了");
        }
        int val = this.elem[this.usedSize-1];
        this.usedSize--;
        return val;
    }
    //取栈顶元素
    public int peek(){
        if(empty()){
            throw new RuntimeException("栈空了");
        }
        return this.elem[this.usedSize-1];
    }
}
