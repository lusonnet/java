import org.junit.Test;

import java.util.TreeSet;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-29
 * Time: 15:55
 */
public class EmployeeTest {
    @Test
    public void test(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("aa",21,new TestDemo(2001,5,21));
        Employee e2 = new Employee("bb",42,new TestDemo(2001,5,31));
        Employee e3 = new Employee("cc",11,new TestDemo(1999,3,6));
        Employee e4 = new Employee("dd",64,new TestDemo(2001,3,26));
        Employee e5 = new Employee("ee",33,new TestDemo(2012,8,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

    }
}
