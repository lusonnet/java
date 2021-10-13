/**
 * Created by lulu
 * Description:
 * 1.创建实现接口的类
 * 2.实现类去实现Runnable中的抽象方法
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到
 * User: Administrator
 * Date: 2021-10-13
 * Time: 18:05
 */

class myThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class Testdemo2 {
    public static void main(String[] args) {
        myThread myThread = new myThread();
        Thread t = new Thread(myThread);
        t.start();
    }
}
