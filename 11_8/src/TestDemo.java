import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-08
 * Time: 18:52
 */
public class TestDemo {

    @Test
    public void test() throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        Class c1 = Person.class;

        Person p = (Person)c1.newInstance();

        Method show = c1.getDeclaredMethod("show",String.class);
        show.setAccessible(true);
        //invoke():参数1：方法的调用者  参数2：指明获取的方法的形参的实参
        show.invoke(p,"CHN");

//可以获取私有的属性
        Class c2 = Person.class;
        Field[] fields = c2.getDeclaredConstructors();
        for(Field field : fields){
            System.out.println(field.getName());//age
        }
    }

    public static void main(String[] args) {
        Class c1 = Person.class;
        Field[] fields = c1.get;//只能获取公有的属性
        for(Field field : fields){
            System.out.println(field.getName());//age
        }
    }
}
