import java.util.Date;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-18
 * Time: 23:09
 */
public class TestDemo3 {

    public void test2(){
        //构造器一：Date():创建一个对于当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1234567890);
        System.out.println(date2.toString());
    }

    @Override
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }


    public static void main(String[] args) {

    }


}
