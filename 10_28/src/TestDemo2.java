import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-28
 * Time: 19:32
 */

class Cuboid{
    double x, y, z; //长、宽、高
    double p;  //密度
    public Cuboid(double x, double y, double z, double p) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.p = p;
        if(x <= 0 || y <= 0 || z <= 0|| p<=0){
            this.x = this.y = this.z = this.p = 0;
        }
    }

    public double length()  //底面周长
    {
        return (x+y)*2;
    }

    public double area()  //底面积
    {
        return x*y;
    }

    public double volumn()  //体积
    {
        return x*y*z;
    }

    public double weight()  //质量
    {
        return p*x*y*z;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double p = in.nextDouble();
        Cuboid cuboid = new Cuboid(x, y, z, p);
        System.out.printf("底面周长：%.2f\n", cuboid.length());
        System.out.printf("底面积：%.2f\n", cuboid.area());
        System.out.printf("体积：%.2f\n", cuboid.volumn());
        System.out.printf("质量：%.2f\n", cuboid.weight());
    }
}