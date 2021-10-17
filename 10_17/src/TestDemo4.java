import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by lulu
 * Description:
 * 实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大原因：
 * 1.call()可以有返回值
 * 2.call()可以抛出异常，被外面的操作捕获，获取异常的信息
 * 3.Callable是支持泛型的！！！！！！！！！！！！！！！
 * User: Administrator
 * Date: 2021-10-17
 * Time: 17:18
 */



class NumThread implements Callable{
    @Override
    public Object call() throws Exception{
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;//自动装箱
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        //将FutureTask的对象作为参数传递给FutureTask构造器中，创建FutureTask的对象
        new Thread(futureTask).start();
        try {
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
