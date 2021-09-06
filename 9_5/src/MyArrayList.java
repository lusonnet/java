import java.util.Arrays;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-06
 * Time: 21:38
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static  int capacity = 10;

    public MyArrayList(){
        this.elem = new int[capacity];
    }

    public boolean isFull(){
        if(this.usedSize == capacity) {
            return true;
        }
        else
            return false;
    }
    //在pos位置新增元素
    public void add(int pos,int data){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*capacity);
            capacity *= 2;//扩容
        }

        if(pos>this.usedSize||pos<0){
            System.out.println("位置不合法！");
            return;
        }
        for (int i = usedSize-1;i >= pos;i--)
        {
            this.elem[i+1] = this.elem[i];//往后移
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //打印
    public void display(){
        for(int i = 0;i < this.usedSize;i++){
            System.out.print(this.elem[i] +" ");
        }
        System.out.println(" ");
    }

    public boolean isEmpty(){
        if(this.usedSize == 0){
            return true;
        }
        return false;
    }

    //判断是否包含某个元素
    public boolean contains(int toFind){
        if(isEmpty())return false;//忘记写
        for(int i = 0;i<this.usedSize;i++){
            if(toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }


    //查找某个元素对应的位置
    public int search(int toFind){
        if(isEmpty())return -1;//忘记写
        for(int i = 0;i<this.usedSize;i++){
            if(toFind == this.elem[i]){
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if(isEmpty()){
            return -1;
        }
        if(pos<0||pos>=this.usedSize){
            System.out.println("pos是不合法的");
        }
        return this.elem[pos];
    }

    //给pos位置的元素设置为value
    public void setPos(int pos,int value){
        if(pos<0||pos>=this.usedSize){
            System.out.println("pos不合法");
            return;
        }
        if(isEmpty()){
            System.out.println("顺序表为空");
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove){
        if(isEmpty())
            return;
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有你要删除的数字");
            return;
        }
        for(int i =index ; i < this.usedSize - 1;i++){
                this.elem[i] = this.elem[i+1];
            }
            this.usedSize--;

    }

    //获取长度
    public int size(){
        return this.usedSize;
    }

    //清除
    public void clear(){
        for(int i =0;i <this.usedSize;i++){
            this.elem[i] = 0;
        }
        this.usedSize = 0;
    }
}
