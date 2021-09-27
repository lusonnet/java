/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-27
 * Time: 21:52
 */
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/


class Box<T> {

    private T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }


}





class A<T> {
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
public class TestDemo {
    //public static void main(String[] args) {
        /*A<String> a = new A<>("100");
        System.out.println(a.get());*/

        public static void main(String[] args) {
            Box<Integer> integerBox = new Box<Integer>();
            Box<String> stringBox = new Box<String>();

            integerBox.add(new Integer(10));
            stringBox.add(new String("aa"));

            System.out.printf("整型值为 :%d\n\n", integerBox.get());
            System.out.printf("字符串为 :%s\n", stringBox.get());
        }
    //}
}
