package generic;

/**
 * Created by lulu
 * Description:泛型
 * User: Administrator
 * Date: 2021-10-24
 * Time: 13:40
 */
class MyStack<T>{
    public T[] elem;
    public int usedSize;

    public MyStack(){
        this.elem = (T[])new Object[5];
    }
    public void push(T val){
        this.elem[this.usedSize++] = val;
    }
    public T getTop(){
        return this.elem[this.usedSize-1];
    }
}

public class Testdemo {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);

    }
}
