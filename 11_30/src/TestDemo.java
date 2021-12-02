import java.lang.reflect.Field;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-30
 * Time: 21:13
 */
public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //获得指定属性的值
        Class c1 = Class.forName("bookManager.User");
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
    }
}

//自定义注解
/*
@interface MyAnnotation{
    String name() default "";
    int age();
    int id() default -1;
    String[] schools() default {"dsswds"};
}*/
