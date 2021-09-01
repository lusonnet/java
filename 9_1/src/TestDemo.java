import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-01
 * Time: 18:01
 */
public class TestDemo {

    public static int func(int n){
        int count = 0;
        while(n!=0)
        {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static int func1(int n)
    {
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(func(n));


    }
}
