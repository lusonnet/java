/**
 * Created by lulu
 * Description:两个线程交替打印1-100
 * User: Administrator
 * Date: 2021-10-17
 * Time: 15:26
 */
class Number implements Runnable{
    private int number = 1;
    Object obj = new Object();
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                notify();
                if(number <= 100){

                    System.out.println(Thread.currentThread().getName()+" "+number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Number number = new Number();
        Thread n1 = new Thread(number);
        Thread n2 = new Thread(number);

        n1.setName("线程1");
        n2.setName("线程2");
        n1.start();
        n2.start();
    }
}
