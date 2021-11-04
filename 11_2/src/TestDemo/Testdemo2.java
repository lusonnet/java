package TestDemo;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-04
 * Time: 17:32
 */



class Person{
    public String id;
    public Person(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class HashBuck<K,V>{
    static class Node<K,V>{
        public K key;
        public V val;
        public Node<K,V> next;
        public Node(K key,V val){
            this.val = val;
            this.key = key;
        }
    }
    public Node<K,V>[] array = (Node<K, V>[]) new Node[8];
    public int usedSize;

    public void put(K key,V val){
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        while(cur!=null){
            if(cur.key.equals(key) ){
                cur.val = val;
                return;
            }
            cur = cur.next;
        }

        Node<K,V> node = new Node<K,V>(key,val);
        cur = array[index];
        if(cur == null){
            array[index] = node;
        }else{
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public V get(K key){
        int hash = key.hashCode();
        int index = hash%array.length;
        Node<K,V> cur = array[index];
        while(cur!=null){
            if(cur.key == key){
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }
}


public class Testdemo2 {
    public static void main(String[] args) {
        Person person1 = new Person("123");
        Person person2 = new Person("123");
        HashMap<Person,String> map = new HashMap<>();
        
    }
}
