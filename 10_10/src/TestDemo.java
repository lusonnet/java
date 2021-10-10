/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-10
 * Time: 19:08
 */

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        /*MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }*/

        /*new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }*/
}
