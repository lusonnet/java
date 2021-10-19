import java.util.PriorityQueue;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-18
 * Time: 21:09
 */
public class TestDemo2 {
    public int[] elem;
    int usedSize = 0;

    //向上调整
    /*private void shiftUp(int child) {
        int parent = (child-1) / 2;
        while (parent >= 0) {
            if (this.elem[parent] < this.elem[child]) {
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                this.elem[child] = tmp;
                child = parent;
                parent = (child-1) / 2;
            }else {
                break;
            }
        }
    }
    //向下调整
    public static void shiftDown(int parent) {
        int child = 2 * parent + 1;
        while (child <this.usedSize) {
            if (child + 1 < this.usedSize && this.elem[child + 1] > this.elem[child]) {
                child = child + 1;
            }
            if (this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            }else {
                break;
            }

        }
    }

    public boolean isEmpty(){
        return this.usedSize == 0;
    }

    public int poll(){
        if(isEmpty())throw new RuntimeException("队列为空") ;
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;
        shiftDown(0);
        return tmp;
    }

    public int peek(){
        if(isEmpty())throw new RuntimeException("队列为空") ;
        return this.elem[0];
    }

    public static int[] topK(int[] array,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < array.length; i++) {
            if(queue.size()<k){
                queue.offer(array[i]);
            }else {
                int top = queue.peek();
                if(top<array[i]){
                    queue.poll();
                    queue.offer(array[i]);
                }
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll();
        }
        return ret;
    }*/
    public static void main(String[] args) {

    }
}
