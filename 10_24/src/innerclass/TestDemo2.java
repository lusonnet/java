package innerclass;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-25
 * Time: 20:21
 */
class OuterClass2{
    public int data1 = 1;
    public static int data2 = 2;
    private int data3 = 3;

    /**
     * 静态内部类：
     * 1.如何获取静态内部类的对象
     *          OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass();
     *
     * 2.在静态内部类里面，不能使用外部类的普通成员变量！！！！！！！
     *          非要使用，则可以通过在静态内部类里面，实例化一个外部类对象，通过这个引用去调用
     *
     *
     *
     */
    static class InnerClass{
        public int data4 = 4;
        public static final int data5 = 5;
        private int data6;
        public int data1 = 1;
        public void func(){
            System.out.println("...");

        }
    }
}

class Demo{
    public void func(){

    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        //OuterClass2.InnerClass innerClass = new OuterClass2.InnerClass();
        new Demo(){

        }.func();
    }
}
