package com.bit.extenddemo;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-11
 * Time: 16:47
 */
class Animal{
    public String name;
    public int age;
    public void eat(){
        System.out.println(name + "吃");
    }
    public void bark(){
        System.out.println(name+"叫");
    }
}

class Dog extends Animal{
    public void upTree(){
        System.out.println(name+"上树");
    }
}

class Cat extends Animal{

}


public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.bark();
        dog.eat();
        Cat cat = new Cat();
        cat.name = "mimi";
        cat.bark();
        cat.eat();
    }
}
