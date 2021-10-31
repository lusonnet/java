/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-31
 * Time: 19:14
 */
/*public class TestDemo {
    public static void main(String[] args) {
        double radius;
        final double PI= 3.15169;
        double area = radius * radius * PI;
        System.out.println("Area is " + area);
    }
}*/
/*
class Test{
    void test(int i){
        System.out.println("I am an int.");
    }
    void test(String s){
        System.out.println("I am a char");
    }
    public static void main(String args[]){
        Test t=new Test();
        t.test('a');
    }
}*/
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

/*
class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur!=null){
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}*/
/*

import java.util.*;
public class Main{
    public static void func(String str1,String str2){
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(char ch:str2.toUpperCase().toCharArray()){
            set.add(ch);
        }
        for(char ch:str1.toUpperCase().toCharArray()){
            if(!set.contains(ch)&&!set2.contains(ch)){
                set2.add(ch);
                System.out.print(ch);
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        func(str1,str2);
    }
}*/
