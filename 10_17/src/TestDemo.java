/**
 * Created by lulu
 * Description:两个客户给一个账户存钱
 * User: Administrator
 * Date: 2021-10-17
 * Time: 15:00
 */
class Account{
    private double balence;
    public Account(double balence){
        this.balence = balence;
    }

    public synchronized void deposit(double amt){
        if(amt>0){
            balence+=amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"成功，余额为："+balence);
        }
    }
}

class Customer extends Thread{
    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;//this:同一个对象（Account）
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}
