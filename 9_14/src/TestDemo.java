/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-14
 * Time: 15:36
 */
class Shape{
    public void drew() {
    //里面写什么都没有意义 - 所以可以省略不写，我们就可以使用下面的方法（抽象类）来实现什么都不写的效果
    }
}
abstract class Shape1{
    public int a = 10;
    public void func(){

    }
    public abstract  void drew();

}
class Cycle extends Shape{
    @Override
    public void drew() {
        System.out.println("画一个圆");//ctrl+o
    }
}

class Rect extends Shape{
    @Override
    public void drew() {
        System.out.println("画一个矩形");//ctrl+o
    }
}
public class TestDemo {
    public static void drewMap(Shape shape){
        shape.drew();
    }
    public static void main(String[] args) {
        drewMap(new Cycle());
        drewMap(new Rect());
    }
}

/*
public class TestDemo{
    public static void main(String[] args) {
        Shape shape = new Shape();
    }
}*/
