package com.home.java;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-10
 * Time: 20:08
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 */
interface Human{
    String getBelief();
    void eat(String food);
}

//被代理类
class SuperMan implements Human {
    @Override
    public String getBelief(){
        return "I can fly!";
    }

    @Override
    public void eat(String food){
        System.out.println("I like eat"+ food);
    }
}

class ProxyFactory{
    //根据加载到内存中的被代理类，动态创建一个代理类及其对象
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler implements InvocationHandler{
    private Object obj;//需要使用被代理类的对象进行赋值
    public void bind(Object obj){
        this.obj = obj;
    }

    //当我们通过代理类的对象，调用方法a时，会自动调用如下方法：invoke()
    //将被代理类要执行的方法a的功能就声明在invoke()里面
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method：即为代理类对象调用的方法，此方法也就作为被代理类对象要调用的方法
        //obj:被代理类的对象
        Object returnValue = method.invoke(obj,args);
        return returnValue;
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //proxyInstance : 代理类的对象
        Human proxyInstance = (Human)ProxyFactory.getProxyInstance(superMan);
        //当通过代理类对象调用方法时，会自动调用被代理类中同名方法 - 反射的体现
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("四川麻辣烫");

    }
}
