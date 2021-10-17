/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-17
 * Time: 16:29
 */

class Clerk{
    public int productCount = 0;
    public void produceProduct() {
        //生产
        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"开始生产第"+productCount+"个");
        }else{
            try {
                wait();///
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consumeProduct() {
        //消费
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName()+"开始消费第"+productCount+"个");
            productCount--;
            notify();//消费完，唤醒对方/////////////////
        }else {
            try {
                wait();//////////////
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{//生产者
    private Clerk clerk;

    public Producer (Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run(){
        System.out.println(getName()+"开始生产");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Coustomer extends Thread{
    private Clerk clerk;
    public Coustomer (Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run(){
        System.out.println(getName()+"开始消费");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Coustomer c1 = new Coustomer(clerk);
        c1.setName("消费者1");

        Coustomer c2 = new Coustomer(clerk);
        c2.setName("消费者2");

        p1.start();
        c1.start();
        c2.start();
    }
}
