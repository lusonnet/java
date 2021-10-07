import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-07
 * Time: 16:12
 */
public class TestDemo {
    public static void main(String[] args) {

    }
}


class MyStack {
    private Queue<Integer> qu1 = new LinkedList<>();
    private Queue<Integer> qu2 = new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        if(!qu1.isEmpty()){
            qu1.offer(x);
        }else if(!qu2.isEmpty()){
            qu2.offer(x);
        }else{
            qu1.offer(x);
        }


    }

    public int pop() {
        if(empty())return 0;
        int a = -1;
        if(!qu1.isEmpty()){
            int size1 = qu1.size();

            for(int i = 0;i < size1 - 1;i++){
                a = qu1.poll();
                qu2.offer(a);
            }
            a = qu1.poll();
        }else{
            int size2 = qu2.size();
            for(int i = 0;i < size2 - 1;i++){
                a = qu2.poll();
                qu1.offer(a);
            }
            a = qu2.poll();
        }
        return a;
    }

    public int top() {
        if(empty())return 0;
        int a = -1;
        if(!qu1.isEmpty()){
            int size1 = qu1.size();
            for(int i = 0;i < size1 ;i++){
                a = qu1.poll();
                qu2.offer(a);
            }

        }else{
            int size2 = qu2.size();
            for(int i = 0;i < size2 ;i++){
                a = qu2.poll();
                qu1.offer(a);
            }

        }
        return a;
    }

    public boolean empty() {
        return qu1.isEmpty() && qu2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
