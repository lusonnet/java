import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-26
 * Time: 16:34
 */
public class TestDemo {

    public static void main(String[] args) {
        /*Integer a = 10;
        int b = a;*/

        Integer a = Integer.valueOf(10);
        int b = a.intValue();
    }

    public static void main3(String[] args) {
        float f1 = 1f;
        float f2 = 2f;
        float  tmp;
        float sum = 0f;
        for(int i = 0;i<20;i++){
            tmp = f1;
            f1 = f2;
            f2 = f2+tmp;
            sum+=f2/f1;
        }
        System.out.println(sum);


    }

    public static void main2(String[] args) {
        for(int i = 2;i<=100;i++){
            boolean flag = true;
            for(int j = 2;j<i;j++){
                if(0==i%j){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i+" ");
            }
        }
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("熟悉C语言和Java（Y/N)");
        String str = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        System.out.println("具有三年以上工作经验或者重点大学毕业（Y/N)");
        String str2 = scanner.next();
        if(str.equals("Y")&(age<35)&str2.equals("Y")){
            System.out.println("录用！");
        }else{
            System.out.println("不录用");
        }
    }
}
