import java.util.Arrays;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-17
 * Time: 21:05
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap(){
        this.elem = new int[10];//10ge0
    }
    //向下转型
    public void shiftdown(int parent){
        int child = 2*parent+1;
        while(child<this.usedSize){
            if(child+1<this.usedSize&&this.elem[child]<this.elem[child+1]){//有右孩子
                child++;
            }
            if(this.elem[child]>this.elem[parent]){
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else{
                break;
            }
        }
    }

    public boolean isFull(){
        return this.usedSize == this.elem.length;
    }

    public void push(int val){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;

        shiftUp(this.usedSize-1);
    }
    //向上转型
    public void shiftUp(int child){
        int parent = (child-1)/2;
        while(parent>=0){
            if(this.elem[child]>this.elem[parent]){
                int tmp = this.elem[parent];
                this.elem[parent] = this.elem[child];
                elem[child] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else{
                break;
            }

        }
    }

    public void creatBigHeap(int[] array){
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }

        for (int i = (this.usedSize-1-1)/2; i>= 0; i--) {
            shiftdown(i);
        }
    }


}
