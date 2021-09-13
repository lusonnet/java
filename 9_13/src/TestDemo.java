/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-13
 * Time: 17:31
 */


class Animal{
    public String name;
    public int age;
    public Animal(String name){//构造方法
        eat();//!!!会发生动态绑定
        this.name = name;
    }
    public void eat(){
        System.out.println(this.name+"animal chi!");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(this.name+"dog chi!");
    }

    public void sleep(){
        System.out.println(this.name+"dog sleep!");
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
}

public class TestDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("xiao");

        //发生向下转型的前提是发生向上转型
        /*Animal animal = new Dog("xiao");
        Dog dog = (Dog)animal;
        dog.eat();//    right*/

/*        Animal animal1 = new Bird("xiao");
        if(animal1 instanceof Dog){
            Dog dog = (Dog)animal1;
            dog.sleep();
        }*/
        //Animal animal = new Animal("haha");
        //Dog dog = (Dog)animal;
        //dog.eat();    error
    }

/*    public static void main(String[] args) {
        Animal animal = new Animal("动物");
        animal.eat();
        Animal animal1 = new Dog("狗");
        animal1.eat();
    }
    public static void func1(Animal animal){

    }
    public static Animal func2(Animal animal){
        return new Dog("xiao");
    }

    public static Dog func3(){
        Dog dog = new Dog("xiao");
        return dog;
    }

    public static void main1(String[] args) {
        Animal animal = new Dog("小胡");
       // 将子类对象赋给了父类对象的引用
        func1(animal);

       Dog dog = new Dog("mimim");
        func1(dog);

        Animal animal2 = func3();
    }*/
}
