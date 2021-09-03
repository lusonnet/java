import java.util.Arrays;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-03
 * Time: 15:34
 */

class Person{
    public int age;
    public String name;
    public static final int SIZE = 10;
    //静态成员变量 -类变量
    public static int count;

    public static void func(){
        System.out.println("这是一个静态方法");
    }
/*    public void eat(){
        System.out.println(name+" 吃饭？ ");
    }
    public void show(){
        System.out.println(" 姓名： "+name+" 年龄： "+age);
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestDemo {
    /**
     * 冒泡排序
     * @param
     */
/*
    public static void bulballSort(int[] array){
        for(int i = 0;i < array.length - 1;i++)
        {
            boolean flg = false;
            for(int j = 0;j < array.length - 1 - i;j++){
                if(array[j]>array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if(flg==false)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,32,23,22,14};
        bulballSort(array);
        System.out.println(Arrays.toString(array));
    }
*/
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person.func();
    }

/*    public static void main(String[] args) {
        Person person = new Person();
        person.name = "lulu";
        person.age = 18;
        System.out.println(person);*/
 /*       person.eat();
        person.show();*/

/*        Person person2 = new Person();
        person2.name = "aaaa";
        person2.age = 18;
        person2.eat();
        person2.show();*/
    //}

}
