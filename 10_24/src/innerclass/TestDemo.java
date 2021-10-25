package innerclass;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-25
 * Time: 19:56
 */

class OuterClass{
    public int data1 = 1;
    public static int data2 = 2;
    private int data3 = 3;

    /**
     * 实例内部类：
     * 1.在实例内部类里面，不可以定义一个静态的成员变量（静态变量不依赖对象）
     *
     * 2.如何创建实力内部类的对象？
     *         OuterClass outerClass = new OuterClass();
     *         OuterClass.InnerClass innerClass = outerClass.new InnerClass();
     *
     * 3.在实例内部类当中，是包含外部类的this的。可以通过外部类类名.this找到
     *         System.out.println(OuterClass.this.data1);
     *         System.out.println(this.data1);
     *
     * 4.实例==内部类对象==，一定要实例化外部类（即2点）
     * 5.适用于`有一个`（单链表）
     */
    class InnerClass{
        public int data4 = 4;
        public static final int data5 = 5;
        private int data6;
        public int data1 = 1;
        public void func(){

            System.out.println("...");
            System.out.println(OuterClass.this.data1);
            System.out.println(this.data1);
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
}
