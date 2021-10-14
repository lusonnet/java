import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-14
 * Time: 20:14
 */

class Window implements Runnable{
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock(true);
    @Override
    public void run(){
        try{
            lock.lock();
            while(true){
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }finally {
            lock.unlock();
        }

    }
}
public class LockDemo {
    public static void main(String[] args) {
        Window w = new Window();
        Thread w1 = new Thread(w);
        Thread w2 = new Thread(w);
        Thread w3 = new Thread(w);

        w1.setName("1");
        w2.setName("2");
        w3.setName("3");

        w1.start();
        w2.start();
        w3.start();
    }
}
