/**
 * Created by lulu
 * Description:
 * 单链表实现
 * User: Administrator
 * Date: 2021-10-05
 * Time: 11:55
 */

class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}

public class MyLinkedList {
    public ListNode head;
    //创建链表
    public void createList(){
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(15);
        ListNode listNode4 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        this.head = listNode1;
    }

    //打印单链表
    public void show(){
        ListNode cur = this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //得到单链表长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //查找关键字是否在单链表里面
    public boolean find(int val){
        ListNode cur = this.head;
        while(cur!=null){
            if(cur.val == val){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //头插法
    public void insertfirst(int data){
        ListNode listNode = new ListNode(data);
        if(this.head == null){
            this.head = listNode;
        }
        else{
            listNode.next = this.head;
            this.head = listNode;
        }
    }

    //尾插法
    public void insertlast(int data){
        ListNode listNode = new ListNode(data);
        if(this.head == null){
            this.head = listNode;
        }else{
            ListNode cur = this.head;
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = listNode;
        }
    }

    //寻找指定位置的前继结点
    public ListNode searchPrev(int index){
        ListNode cur = this.head;
        int count = 0;
        while(count!=index-1){
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //任意位置插入(第一个数据节点为0号下标)
    public void addIndex(int index,int data){
        ListNode listNode = new ListNode(data);
        if(index<0||index>size())return;
        if(index == 0){
            insertfirst(data);
            return;
        }
        if(index == size()){
            insertlast(data);
            return;
        }
        ListNode cur = searchPrev(index);
        listNode.next = cur.next;
        cur.next = listNode;
    }

    //查找值为val的结点的前继结点
    public ListNode searchPrevNode(int val){
        ListNode cur = this.head;
        while(cur.next!=null){
            if(cur.next.val==val){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int val){
        if(this.head == null)return;
        if(this.head.val == val){
            this.head = this.head.next;
            return;
        }
        ListNode cur = searchPrevNode(val);
        if(cur == null){
            return;
        }
        ListNode del = cur.next;
        cur.next = del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int val){
        if(this.head == null)return;
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur!=null){
            if(cur.val == val){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        //最后判断头结点
        if(this.head.val == val){
            this.head = this.head.next;
        }
    }

    public void clear(){
        while (this.head!=null){
            ListNode curNext = this.head.next;
            this.head.next = null;
            this.head = curNext;//
        }
    }

    //反转
    public ListNode reverseList(){
        if(head == null||head.next == null)return head;
        ListNode cur = head;
        ListNode newHead = null;

        while(cur!=null){
            ListNode curNext = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = curNext;
        }
        return newHead;
    }

    //中间节点
    public ListNode middleNode(){
        if(head == null)return head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }





}
