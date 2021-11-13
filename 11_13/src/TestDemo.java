/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-13
 * Time: 20:49
 */

interface OneToN{
    int disp(int n);
}
class Sum implements OneToN {   // 继承接口
    public int disp(int n){      // 实现接口中的disp方法
        int s = 0,i;
        for(i = 1;i <= n;i ++)  s += i;
        return s;
    }
}
class Pro implements OneToN {   // 继承接口
    public int disp(int n){      // 实现接口中的disp方法
        int m = 1,i;
        for(i = 1;i <= n;i ++) {
            m *= i;
        }
        return m;
    }
}
public class TestDemo{
    public static void main(String args[]){
        int n = 10;
        Sum s = new Sum();
        Pro p = new Pro();
        System.out.println("sum of1 to n = " + s.disp(n));
        System.out.println("pro of 1to n = " + p.disp(n));
    }
}

