import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2022-01-04
 * Time: 8:23
 */

class Complex{
    private double x;
    private double y;

    public Complex(){}
    public Complex(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void setRealPart(double x){
        this.x = x;
    }

    public void setImaginaryPart(double y){
        this.y = y;
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public Complex add(Complex b){
        Complex c = new Complex(b.getX(),b.getY());
        c.setRealPart(c.getX()+x);
        c.setImaginaryPart(c.getY()+y);
        return c;
    }
    public Complex sub(Complex b){
        Complex c = new Complex(b.getX(),b.getY());
        c.setRealPart(x-c.getX());
        c.setImaginaryPart(y-c.getY());
        return c;
    }
    public String toString(){
        if(x==0&&y!=0){
            return y+"i";
        }
        else if(x!=0&&y==0){
            return x+"";
        }
        else if(x==0&&y==0)return 0+"";
        else if(x!=0&&y!=0&&y>0){
            return x+"+"+y+"i";
        }
        else
            return x+""+y+"i";
    }
}
public class TestDemo {
    public static void main(String [] args){
        Complex a=new Complex();
        Complex b=new Complex();
        Scanner in=new Scanner(System.in);
        a.setRealPart(in.nextDouble());
        a.setImaginaryPart(in.nextDouble());
        b.setRealPart(in.nextDouble());
        b.setImaginaryPart(in.nextDouble());
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.add(b));
        System.out.println(a.sub(b));
    }
}
