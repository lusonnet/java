import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-07
 * Time: 12:31
 */
public enum TestEnum2 {
    RED("红色",1),WHITE("白色",2),BLACK("黑色",3),GREEN("绿色",4);

    public String color;
    public int ordinal;
    TestEnum2(String color,int ordinal){
        this.color = color;
        this.ordinal = ordinal;
    }

    public static void reflectPrivateConstructor() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cl = Class.forName("TestEnum2");
        Constructor<?> constructor = cl.getDeclaredConstructor(String.class,int.class,String.class,int.class);
        constructor.setAccessible(true);
        TestEnum2 testEnum2 = (TestEnum2) constructor.newInstance("a",99,"父类的参数",100);
        System.out.println(testEnum2);
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println(RED.compareTo(BLACK));
        reflectPrivateConstructor();
    }
}
