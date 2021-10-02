import java.util.Scanner;
import java.util.Random;
/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-02
 * Time: 17:13
 */
public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {1,1,3,4,5,4,5,5};
        chat(arr);
    }
    public static void chat(int[] a){
        for(int i = 0;i < a.length;i++){
            int count = 0;
            for(int j = 0;j<a.length;j++){
                if (a[i] == a[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(a[i]);
            }
        }
    }
    public static void main7(String[] args) {
        for(int i = 0;i < 1000;i++){
            int bai = i/100;
            int shi = i%100/10;
            int ge = i%10;
            int sum = bai*bai*bai+shi*shi*shi+ge*ge*ge;
            if(sum == i){
                System.out.print(i+" ");
            }
        }
    }

    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(100);
        while(true) {
            System.out.println("请输入一个数字：");
            int num = scan.nextInt();
            if(num>rand) {
                System.out.println("你猜的大了");
            }
            else if(num==rand) {
                System.out.println("猜对了");
                break;//猜对后跳出循环
            }
            else{
                System.out.println("猜小了");
            }
        }
        System.out.println("游戏结束！");
    }


    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i==j||i==n-j-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 2;i < n;i++){
            if(n % i == 0){
                System.out.println("不是素数");
                return;
            }
        }
        System.out.println("是素数");
    }

    public static void main3(String[] args) {
        boolean flag = true;
        for(int i = 2;i <= 100;i++){
            for(int j = 2;j < i;j++ ){
                if(i % j==0){
                    flag = false;
                    break;
                }
            }
           if(flag){
               System.out.println(i);
           }
        }
    }
    public static void main2(String[] args) {
        for(int i = 1000;i <= 2000;i++ ){
            if(i%4==0&&i%100!=0||i%400==0){
                System.out.println(i);
            }
        }
    }
    public static void main1(String[] args) {
        int count = 0;
        for(int i = 1;i<=100;i++)
        {
            if(i%10==9||i/10==9||i%10==9&&i/10==9) {
                count++;
            }
        }
        System.out.println(count);

    }
}
