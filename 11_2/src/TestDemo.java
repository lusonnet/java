/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-02
 * Time: 22:15
 */
class HashBuck{
    static class Node{
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public Node[] array;
    public int usedSize;
    public HashBuck(){
        this.array = new Node[8];
    }

    public int get(int key){
        int index = key%array.length;
        Node cur = array[index];
        while(cur!=null){
            if(cur.key == key){
                return cur.val;
            }
            cur = cur.next;
        }
        throw new IllegalArgumentException();
    }

    public void put(int key,int val){
        int index = key % array.length;
        Node cur = array[index];
        while(cur!=null){
            if(cur.key == key){
                cur.val = val;
                return;
            }
            cur = cur.next;
        }
        Node node = new Node(key,val);
        cur = array[index];
        if(cur == null){
            array[index] = node;
        }else{
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = node;
        }

        this.usedSize++;
        // HashMap 的负载因子设置成 0.75
        //在向 HashMap 中添加元素过程中，如果 元素个数（size）超过临界值（threshold） 的时候，
        // 就会进行自动扩容（resize）
        if(Load() >= 0.75){
            resize();
        }
    }

    public double Load(){
        return this.usedSize * 1.0 / array.length;
    }
    //扩容
    public void resize(){
        Node[] newArray = new Node[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i];
            while (cur!=null){
                Node curNext = cur.next;
                int index = cur.key % newArray.length;
                Node curNode = newArray[index];
                if(curNode==null){
                    newArray[index] = cur;//为空直接赋值
                }else{
                    while(curNode.next!=null){
                        curNode = curNode.next;
                    }
                    curNode.next = cur;
                }
                cur.next = null;
                cur = curNext;
            }
        }
        array = newArray;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        hashBuck.put(1,11);
        hashBuck.put(2,22);
        hashBuck.put(3,33);
        hashBuck.put(17,177);
        hashBuck.put(24,244);
        hashBuck.put(15,155);
        System.out.println("oooooo");
    }
}
