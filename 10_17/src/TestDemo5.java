import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-17
 * Time: 19:03
 */

class NumberThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

class NumberThread1 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class TestDemo5 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);//10个线程
        service.execute(new NumberThread());
        service.execute(new NumberThread1());

        service.shutdown();//关闭线程池
    }
}
