/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-26
 * Time: 21:49
 */
class Person{
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("人走路");
    }

    public void eat(){
        System.out.println("人吃饭");
    }
}

interface Info{
    void show();
}
class Student extends Person implements Info{
    @Override
    public void walk(){
        System.out.println("学生走路");
    }
    @Override
    public void show(){

    }
}

public class AnnotationTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.walk();
        p.eat();
    }
}
