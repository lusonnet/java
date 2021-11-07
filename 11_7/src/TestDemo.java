import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.time.Period;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-07
 * Time: 11:27
 */
public class TestDemo {

    /*//反射私有构造方法
    public static void reflectPrivate(){
        Class<?> c1 = null;
        try {
            c1 = Class.forName("demo.Student");
            Constructor<?> constructor = c1.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);//所有访问私有构造方法都必须调用.setAccessible(true)
            Student student = (Student)constructor.newInstance("aa",11);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    //反射私有属性
    public static void reflectPrivateFiled(){
        Class<?> c1 = null;
        try {
            c1 = Class.forName("demo.Student");
            Field filed = c1.getDeclaredField("name");
            filed.setAccessible(true);
            Student student = (Student)c1.newInstance();



        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }*/



    public static void main(String[] args) throws ClassNotFoundException {
        Student s1 = new Student();
        Class c1 = s1.getClass();
        System.out.println(c1);

        Class c2 = Student.class;
        System.out.println(c2);

        Class c3 = Class.forName("Student");
        System.out.println(c3);
    }
}
