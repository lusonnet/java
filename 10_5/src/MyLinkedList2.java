/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-05
 * Time: 16:21
 */

class ListNodeX{
    public int data;
    public ListNodeX prev;
    public ListNodeX next;
    public ListNodeX(int data){
        this.data = data;
    }
}
public class MyLinkedList2 {
    public ListNodeX head;//头结点
    public ListNodeX last;//尾结点

    //头插法
    public void addFirst(int data) {
        ListNodeX node = new ListNodeX(data);
        if(head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNodeX node = new ListNodeX(data);
        if(head == null){
            this.head = node;
            this.last = node;
        }else{
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        ListNodeX cur = this.head;
        if(index < 0||index > size())return;//判断合法性
        if(index == 0){
            addFirst(data);//头插
            return;
        }
        if(index==size()){
            addLast(data);//尾插
            return;
        }
        while(index != 0){
            cur = cur.next;
            index--;
        }
        ListNodeX node = new ListNodeX(data);
        //双链表的插入需要四步，顺序可以调换
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;//不要写漏.prev
        cur.prev = node;
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNodeX cur = head;
        while(cur!=null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNodeX cur = this.head;
        while(cur!=null){
            if(cur.data == key){
                if(cur==this.head){//为头结点
                    this.head = this.head.next;//head后移
                    if(this.head==null){//后移后的头结点为空
                        this.last = null;//将尾结点置空
                    }else{
                        this.head.prev = null;//不为空，将前驱结点置空
                    }
                }else{//不为头结点
                    cur.prev.next = cur.next;
                    if(cur.next == null){//为尾结点
                        this.last = cur.prev;
                    }else{//不为尾结点
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }else{
                cur = cur.next;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNodeX cur = this.head;
        while(cur!=null){
            if(cur.data == key){
                if(cur==this.head){//为头结点
                    this.head = this.head.next;
                    if(this.head==null){
                        this.last = null;
                    }else{
                        this.head.prev = null;
                    }
                }else{
                    cur.prev.next = cur.next;
                    if(cur.next == null){//为尾结点
                        this.last = cur.prev;
                    }else{
                        cur.next.prev = cur.prev;
                    }
                }
                cur = cur.next;//与只删除第一次出现的代码几乎相同，只多了继续后移的这句代码
            }else{
                cur = cur.next;
            }
        }
    }
    //得到链表的长度
    public int size() {
        int count = 0;
        ListNodeX cur = head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display() {
        ListNodeX cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear() {
        ListNodeX cur = this.head;
        while(cur!=null){
            ListNodeX curNext = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = curNext;
        }
        this.head = null;
        this.last = null;
    }

}
