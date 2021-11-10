package com.home.java; /**
 * Created by lulu
 * Description:能在双十一前夕敲代码的都是真爱
 * User: Administrator
 * Date: 2021-11-10
 * Time: 19:40
 */

/**
 * 静态代理
 */
interface ClothFactory{
    void produceCloth();
}

class ProxyClothFactory implements ClothFactory{
    private ClothFactory factory;
    public ProxyClothFactory(ClothFactory factory){
        this.factory = factory;
    }

    @Override
    public void produceCloth(){
        System.out.println("代理工厂准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续的收尾");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory{
    @Override
    public void produceCloth(){
        System.out.println("Nike生产一批运动服");

    }
}
public class TestDemo {
    public static void main(String[] args) {
        //创建被代理类的对象
        ClothFactory nile = new NikeClothFactory();
        //创建代理类的对象
        ClothFactory proxyClothFactory = new ProxyClothFactory(nile);
        proxyClothFactory.produceCloth();
    }
}


