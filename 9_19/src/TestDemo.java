import java.security.spec.PSSParameterSpec;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-19
 * Time: 22:26
 */
public class TestDemo {
    public static void main1(String[] args) {
        String str1 = "hellobit";
        System.out.println(str1);
        String str2 = new String("hello");
    }

    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1==str2);
    }

    public static void main3(String[] args) {
        String str1 = "helloworld";
        String str2 = "hello" + "world";//编译时已经被优化了
        //常量在编译的时候已经知道，变量在运行的时候知道

        System.out.println(str1==str2);
    }

    public static void main4(String[] args) {
        String str1 = "helloworld";
        String str2 = new String("helloworld");
        str1.intern();
        System.out.println(str1==str2);
    }

    public static void main5(String[] args) {
        char[] value = {'a','b','c','d','e'};
        String str = new String(value,1,2);
        System.out.println(str);

    }

    public static void main6(String[] args) {
        String str = "1a23456";
        char[] chars = str.toCharArray();
        for (char ch:chars) {
            if(ch<'0'||ch>'9'){
                System.out.println("不全都是字符");
                return;
            }
        }
        System.out.println("全都是字符");
    }

    public static void main7(String[] args) {
        String str = "hello";
        String str2 = new String("hello");
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.compareTo(str2));
    }

    public static void main8(String[] args) {
        String str1 = "abcdefgh";
        boolean flg = str1.contains("abcd");
        System.out.println(flg);
        System.out.println(str1.indexOf("cdef"));
        System.out.println(str1.startsWith("abcdefgh"));
    }

    public static void main9(String[] args) {
        String str = "abcdefgh";
        String str2 = str.replace('a','g');
        System.out.println(str2);
        String str3 = str.replace("ab","  ");
        System.out.println(str3);
    }

    public static void main10(String[] args) {
        String str = "Java string-split+test";
        String[] strings = str.split(" |-|\\+");
        for (String s:strings) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
    }
}
