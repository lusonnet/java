import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-14
 * Time: 20:50
 */
public class TreeDemo {
    int[] elem ;
    int usedSize;


    public int poll(){
         if(isEmpty()){
             throw new RuntimeException("队列为空");
         }
         int tmp = this.elem[0];
         this.elem[0] = this.elem[usedSize-1];
         this.elem[this.usedSize-1] = tmp;

         //shiftDown(0);
         return tmp;
    }

    public boolean isEmpty(){
        return this.usedSize == 0;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }

        return this.elem[0];
    }
}
