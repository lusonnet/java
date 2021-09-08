/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-08
 * Time: 18:42
 */

class Node{
    public int val;
    public Node next;

    public Node(int val){
        this.val = val;
    }
        }
public class TestDemo {
    public Node head;//头结点

    public void createlist(){
        Node node1 = new Node(12);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        this.head = node1;
    }

    public void show(){
        Node cur = this.head;
        while(cur !=null){//注意这里不能是head->next!=null,否则进不去最后一个元素
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }

    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur!=null){
            cur  = cur.next;
            count++;

        }
        return count;
    }

    public boolean contains(int key){
        Node cur = this.head;
        while(cur!=null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法 - 关键是找到尾巴结点
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null){
            this.head = node;
        }else{
            while(cur.next!=null){
               cur = cur.next;
            }
            cur.next = node;
        }
    }

    /**
     * 如何判断什么时候写cur==null?
     *  当需要把列表都遍历完的时候
     */

    public Node searchPre(int index){
        Node cur = this.head;
        int count = 0;
        while(count!=index-1){
            cur = cur.next;
            count++;
        }
        return cur;//返回前一个结点
    }

    //任意位置插入，第一个数据结点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index > size()){
            System.out.println("我们下标不合法");
            return;
        }
        if(index == 0){
            addFirst(data);//头插法
            return;
        }
        if(index == size()){
            addLast(data);
            return;//尾插法
        }
        Node cur = searchPre(index);
        Node node = new Node(data);
        node.next = cur.next;//
        cur.next = node;//核心代码


    }

    public Node searchPreNode(int val){
        Node cur = this.head;
        while(cur.next != null){  // 没有考虑头结点
            if(cur.val == val) {
                return cur;
            }
            cur = cur.next;
        }
        System.out.println("么有出现");
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int val){
        if(this.head == null){
            return;
        }
        //判断头结点是否为关键字
        if(this.head.val == val){
            this.head = this.head.next;  //JVM会自动回收
            return;
        }
        Node cur = searchPreNode(val);
        if(cur == null){
            System.out.println("么有你要删除的结点");
            return;
        }
        Node del = cur.next;
        cur.next = del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int val){
        if(this.head == null){
            return;
        }
        Node pre = this.head;
        Node cur = this.head.next;
        while(cur!=null){
            if(cur.val == val){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }

        }
        //判断头结点是否为关键字
        if(this.head.val == val){
            this.head = this.head.next;

        }
    }

}
