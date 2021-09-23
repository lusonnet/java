/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-23
 * Time: 17:38
 */

class MyException extends Exception{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}
public class TedtDemo {



    public static void func2() throws MyException{
        int a = 10;
        if(a==10){
            throw new MyException("a==10");
        }
    }
    public static void main2(String[] args) {
        try{
            func2();
        }catch(MyException e){

        }
    }

//3.在Java里面有一些类本身就会抛出异常，比如Object clone()，所以我们必须在调用时加上抛出异常
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void func() throws RuntimeException{
        int a = 10;
        if(a==10){
            throw new RuntimeException("a==10");
        }
    }
    public static void main1(String[] args) {
        try{
            func();
        }catch(RuntimeException e){
            System.out.println("抛出了一个异常");
        }
        System.out.println("aaaaaaaaa");


    }
}
