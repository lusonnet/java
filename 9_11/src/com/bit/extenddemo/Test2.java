package com.bit.extenddemo;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-11
 * Time: 17:08
 */
class Animal1{
    public String name;
    public int age;

    //???
    public Animal1(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "吃");
    }
    public void bark(){
        System.out.println(name+"叫");
    }
}

class Dog1 extends Animal1{
    public Dog1(String name){
        super(name);//显示调用父类的构造方法
    }
    public void upTree(){
        System.out.println(name+"上树");
    }
}

class Cat1 extends Animal1{

    public Cat1(String name) {
        super(name);
    }

    /*
    public Cat1(){
        super();
    }*/
}

public class Test2 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("haha");
        cat1.eat();
    }
}
