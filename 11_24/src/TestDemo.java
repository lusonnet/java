import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-24
 * Time: 16:49
 */
public class TestDemo {
    public static void main(String[] args) {
        int d4,d3,d2,d1,num=0;

        System.out.println("请输入一个数:");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();

        if(num>=1&&num<=10000){
            d4=num/1000;//得到千位上的数
            d3=(num%1000)/100;//得到百位上的数
            d2=(num%100)/10;//得到十位上的数
            d1=num%10;

            if(d4!=0){
                System.out.println(num+"是4位数");
                if(d4==d1&&d3==d2){
                    System.out.println(num+"是回文数");
                }else{
                    System.out.println(num+"不是回文数");
                }
            }else if(d3!=0){
                System.out.println(num+"是3位数");
                if(d3==d1){
                    System.out.println(num+"是回文数");
                }else{
                    System.out.println(num+"不是回文数");
                }
            }else if(d2!=0){
                System.out.println(num+"是2位数");
                if(d2==d1){
                    System.out.println(num+"是回文数");
                }else{
                    System.out.println(num+"不是回文数");
                }
            }else{
                System.out.println(num+"是1位数");
                System.out.println(num+"是回文数");
            }


        }else{
            System.out.println("该数不在1—9999之间，请重新输入！！！");
        }
    }
}
