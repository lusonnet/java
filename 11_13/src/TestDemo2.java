import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-13
 * Time: 21:15
 */
/*public class TestDemo2 {*/
    /*public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null)return false;
        if(!super.equals(obj))return false;
        DecimalFormat df = new DecimalFormat("#.##");
        Employee other = (Employee) obj;
        if(company == null&& other.company == null)
            return df.format(salary).equals(df.format(other.salary));
        else if (company == null || other.company == null) return false;
        return company.equals(other.company)
                && df.format(salary).equals(df.format(other.salary));

    }
    public static void main(String[] args) {

    }*/




    abstract class shape {// 抽象类
        /* 抽象方法 求面积 */
        public abstract double getArea( );

        /* 抽象方法 求周长 */
        public abstract double getPerimeter( );
    }

    /* 你提交的代码将被嵌入到这里 */
    class Circle extends shape
    {
        double radius;
        final static double PI = 3.1415926535;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double getArea() {
            // TODO Auto-generated method stub
            return PI*radius*radius;
        }
        @Override
        public double getPerimeter() {
            // TODO Auto-generated method stub
            return 2*PI*radius;
        }

    }


public class TestDemo2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
            double r = input.nextDouble( );
            shape c = new  Circle(r);

            System.out.println(d.format(c.getArea()));
            System.out.println(d.format(c.getPerimeter()));
            input.close();
        }
    }

//}
