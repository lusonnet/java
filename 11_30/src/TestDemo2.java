import bookManager.User;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-02
 * Time: 22:29
 */
public class TestDemo2 {
    public void test1(Map<String, User> map, List<User> list){
        System.out.println("test01");
    }
    public Map<String,User> test01(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = TestDemo2.class.getMethod("test1",Map.class,List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for(Type genericParameterType : genericParameterTypes){
            System.out.println("#"+genericParameterType);
            if(genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument: actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }
    }
}
