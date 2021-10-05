import java.util.Arrays;

/**
 * Created by lulu
 * Description: 实现ArrayList
 * User: Administrator
 * Date: 2021-10-05
 * Time: 15:38
 */


public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity = 10;

    public MyArrayList(){
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    public boolean isFull(){
        if(usedSize == this.elem.length){
            return true;
        }
        return false;
    }

    //增加元素
    public void add(int pos,int data){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if(pos<0||pos>this.usedSize)return;
        int i = this.usedSize - 1;
        while(i>=pos){
            this.elem[i+1] = this.elem[i];
            i--;
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //打印
    public void show(){
        for(int i = 0;i < this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //判断是否包含
    public boolean contains(int n){
        for(int i = 0;i < this.usedSize;i++){
            if(this.elem[i] == n){
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应位置
    public int search(int val){
        for(int i = 0;i < this.usedSize;i++){
            if(val == this.elem[i]){
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos){
        if(this.usedSize==0)return -1;
        if(pos<0||pos>=this.usedSize) {//?
            return -1;
        }
        return this.elem[pos];
    }

    //获取长度
    public int Size(){
        return usedSize;
    }

    //删除第一次出现的关键字
    public void deleteKey(int del){
        int index = search(del);
        for (int i = index; i < this.usedSize - 1;i++){
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }
}
