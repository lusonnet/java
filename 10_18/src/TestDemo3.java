import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-18
 * Time: 23:09
 */
public class TestDemo3 {


    public void test3(){



    }
    public void test2(){
        //构造器一：Date():创建一个对于当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1234567890);
        System.out.println(date2.toString());
    }


    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }


    public static void main(String[] args) {
        /*LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(localTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2021,10,19,21,47);
        System.out.println(localDateTime1);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getYear());

        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);//2021-10-19 - 体现不可变性
        System.out.println(localDate1);//2021-10-22*/
        //自定义格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
        String str = formatter.format(LocalDateTime.now());
        System.out.println(str);

        //解析
        TemporalAccessor accessor = formatter.parse("2021-10-19 22:19:00");
        System.out.println(accessor);
    }


    public int compareTo(Object o) {
//把Object o转成Name型，便于比较
       // Name n = (Name)o;
//我们Name怎么比大小呢？那就直接比比我们的lastName吧，
//怎么比，直接用String的compareTo方法好了，java写好的，不用白不用
       // int lastCmp = lastName.compareTo(n.lastName);
//看看吧如果lastName比出结果了，那最好罗，如果比出来一样咋办？那我们再比比firstName吧
        //return
        //        (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }

}
