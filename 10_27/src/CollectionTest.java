import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-27
 * Time: 14:28
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        System.out.println(coll.size());//4

        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);

        System.out.println(coll.size());
        System.out.println(coll);

    }
}
