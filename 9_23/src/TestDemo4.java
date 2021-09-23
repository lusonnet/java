/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-23
 * Time: 21:09
 */
public class TestDemo4 {

    public static void func() throws  ArrayIndexOutOfBoundsException{
      int[] array = {1,2,3,4};
        System.out.println(array[100]);
    }

    public static void main(String[] args) {
        try{
            func();
        }catch(NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("捕获异常了");
        }
    }

    public static void main6(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("before");
        try{
            System.out.println(arr[100]);
            System.out.println("abcdefg");

        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印出现异常的调用栈
            System.out.println("数组越界");
        }catch (Exception e){
            System.out.println("异常");
        }finally {
            System.out.println("finally一定会被执行！");
        }
        System.out.println("after");
    }

    public static void main5(String[] args) {
        String str = "abcdefgh";
        String ret = str.substring(2,6);//左闭右开
        System.out.println(ret);
    }

    public static void main4(String[] args) {
        String str = "ab cd efg";
        String[] strings = str.split(" ");
        for(String s:strings){
            System.out.println(s);
        }
    }

    public static void main3(String[] args) {
        String str = "abcdef";
        //replace()替换
        String str2 = str.replace('a','h');
        System.out.println(str2);
    }
    public static void main2(String[] args) {
        String str = "abcdef";
        boolean flg = str.contains("bcd");//true
        System.out.println(flg);

        System.out.println(str.indexOf("bcd"));//KMP算法//1

        System.out.println(str.indexOf("cdef",1));//2

        System.out.println(str.lastIndexOf("cdef",9));

        System.out.println(str.startsWith("ab",2));//是否以ab开始

        System.out.println(str.endsWith("ef"));
    }

    public static void main1(String[] args) {
        String str = "hehe";
        String str2 = new String("Hehe");
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.compareTo(str2));
    }
}
