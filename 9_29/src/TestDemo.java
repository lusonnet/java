import java.util.*;
/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-29
 * Time: 19:27
 */


public class TestDemo {
    public class ListMode{
        int val;
        ListNode next = null;

        ListNode(int val){
            this.val = val;
        }
    }

    public boolean chkPalindrome(){
        if(this.head ==null){
            return false;
        }
        if(this.head.next == null){
            return true;
        }
        ListNode slow = this.head;
        ListNode fast = this.head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }//找中间结点
        ListNode cur = slow.next;
        while(cur!=null){
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(slow!=head){
            if(slow.val!=head.val){
                return false;
            }
            if(haed.next == slow){
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    public boolean hasCycle(){
        ListNode fast = this.head;
        ListNode slow = this.head;

        while(fast!=bull&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }

        }
        return false;
    }


}


