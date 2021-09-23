/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-23
 * Time: 20:25
 */

class MyArrayList<T>{
    public T[] elem;
    public int usedSize;
    public MyArrayList(){
        this.elem = (T[])new Object[10];
    }
    public void add(T val){
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }
    public T get(int pos){
        return this.elem[pos];
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        MyArrayList<String>myArrayList = new MyArrayList<>();
        myArrayList.add("hh");
    }
}
