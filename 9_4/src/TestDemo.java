/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-04
 * Time: 20:51
 */

class Person{
    private int age;
    private String name;
    private int[] elem = new int[10];
/*    public Person(){
        System.out.println("不带参数的构造方法");
    }*/

    public Person (String name){
        this.name = name;
        System.out.println("带参数的构造方法");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String myName) {
        this.name = myName;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Person person = new Person("lulu");

    }
}
