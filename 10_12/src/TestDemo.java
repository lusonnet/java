import static java.lang.Thread.sleep;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-12
 * Time: 15:23
 */

class Windows implements Runnable{
    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while(true){

            synchronized (obj){
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"卖票，票号为："+ticket);
                    ticket--;
                }else {
                    break;
                }
            }

        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        /*helloThread h1 = new helloThread("Thread:1");

        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        //
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
*/
        Windows w = new Windows();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}

