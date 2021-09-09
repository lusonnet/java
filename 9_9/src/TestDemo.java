import java.util.*;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-09
 * Time: 19:36
 */
public class TestDemo {
    public static void main(String[] args) {
        Scanner
    }

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)return head;

        ListNode cur = head;
        ListNode prev = null;

        while(cur!=null){
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
}*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
    快慢结点
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){         //&& 左右顺序不能颠倒
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }
}*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        if(k<=0){
            return null;
        }
        while(k-1 != 0){
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else{
                return null;//判断k是否大于所有结点
            }

        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
}*/
