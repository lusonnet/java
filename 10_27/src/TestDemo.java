import java.util.Iterator;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-27
 * Time: 21:34
 */
public class TestDemo {
    public static void main(String[] args) {
        Iterator iterator = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };

        //hasNext()：判断是否还有下一个元素
        while(iterator.hasNext()){
            //next()：
            //1.指针下移
            //2.将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }
    }
}
