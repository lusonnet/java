import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-27
 * Time: 14:46
 */
public class TestDemo {
    public void test(){

    }
}

//定义一个注解
@Target(value = {ElementType.METHOD,ElementType.TYPE})//该注解只能在Method、TYPE里面使用
@interface MyAnnotation{

}
