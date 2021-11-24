/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-24
 * Time: 17:23
 */
import java.util.Scanner;
import java.util.Random;
public class TestDemo2 {
    public static void main(String []args){
        Scanner reader=new Scanner(System.in);
        Random random=new Random();
        System.out.printf("给你一个1~100之间的整数，请猜测这个数\n");
        int realNumber=random.nextInt(100)+1;
        int yourGuess=0;
        System.out.print("输入您的猜测：");
        yourGuess=reader.nextInt();
        while(yourGuess!=realNumber)
        {
            if(yourGuess>realNumber)
            {
                System.out.print("猜大了，再输入你的猜测：");
                yourGuess=reader.nextInt();
            }
            else if(yourGuess<realNumber)
            {
                System.out.print("猜小了，再输入你的猜测：");
                yourGuess=reader.nextInt();
            }
        }
        System.out.printf("猜对了！\n");
    }
}
