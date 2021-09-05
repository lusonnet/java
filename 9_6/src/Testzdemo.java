/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-05
 * Time: 11:25
 */

class Myvalue{
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

public class Testzdemo {
/*    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add(){
        return this.num1+this.num2;
    }

    public int sub(){
        return this.num1-this.num2;
    }

    public int mul(){
        return this.num1*this.num2;
    }

    public double dev(){
        return this.num1*1.0 / this.num2;
    }

    public static void main(String[] args) {
        Testzdemo homework = new Testzdemo();
        homework.setNum1(10);
        homework.setNum2(20);

        System.out.println(homework.add());
        System.out.println(homework.sub());
        System.out.println(homework.mul());
        System.out.println(homework.dev());

    }*/

    public static void swap(Myvalue myval1,Myvalue myval2){
        int tmp = myval1.getVal();
        myval1.setVal(myval2.getVal()) ;
        myval2.setVal(tmp);
    }

    public static void main(String[] args) {
        Myvalue myvalue1 = new Myvalue();
        myvalue1.setVal(10);
        Myvalue myvalue2 = new Myvalue();
        myvalue2.setVal(20);

        swap(myvalue1,myvalue2);
        System.out.println(myvalue1.getVal());
        System.out.println(myvalue2.getVal());
    }
}
