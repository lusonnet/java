/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-08-02
 * Time: 11:16
 */
public class TestDemo {

    public static void main(String[] args) {
        String str = "aaaaaaa";
        System.out.println(str);
        int a = 10;
        System.out.println("a = " + a);
        int b = 20;
        System.out.println(a + b + "hello" );
    }

    public static void main6(String[] args) {
        boolean a;
    }

    public static void main5(String[] args) {
        short a = 10;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }

    public static void main4(String[] args) {
        byte a = 127;//注意不要超出范围
        byte b = 20;
        System.out.println(b);

    }

    public static void main3(String[] args) {
        float f = 12.5f;
        System.out.println(f);

    }

    public static void main2(String[] args) {
        double d = 10.25;
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        double num = 1.1;
        System.out.println(num * num);
    }
    public static void main1(String[] args) {
        long a = 10L;
        System.out.println(a);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
