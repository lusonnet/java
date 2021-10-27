import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-27
 * Time: 22:10
 */
public class TestDemo2 {
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person());

        for (Object obj:coll) {
            System.out.println(obj);
        }
    }

    @Test
    public void test3(){
        String[] arr = new String[]{"MM","MM","MM"};
        for (String s:arr) {
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
