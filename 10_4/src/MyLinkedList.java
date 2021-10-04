/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-04
 * Time: 23:00
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
}

public class MyLinkedList {

    int size;
    ListNode head;

    public MyLinkedList() {
        this.size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode curNode = head;
        for (int i = 0; i <= index; i++) {
            curNode = curNode.next;
        }
        return curNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size){
            return ;
        }
        if(index < 0){
            index = 0;
        }
        size++;
        //获取插入节点的前驱
        ListNode pre = head;
        for(int i = 0;i < index;i++){
            pre = pre.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        size--;
        //获取删除节点的前驱
        ListNode pre = head;
        for(int i = 0; i < index; i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }

}
