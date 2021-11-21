/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-21
 * Time: 19:37
 */

import java.util.Arrays;
        import java.util.Scanner;

public class Testdemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n>0){
            int[] a=new int[n];
            int[] b=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            System.out.println(Arrays.toString(a));
            System.arraycopy(a, 0, b, 0, a.length);
            System.out.println(Arrays.toString(b));
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
            int m= Arrays.binarySearch(a,sc.nextInt());//这里不能使用顺序查找
            if(m>-1) System.out.println(m);//下标有效则找到
            else System.out.println("no");
            if (n>=2){
                a[0]=9;
                a[1]=9;
            }
            System.out.println(Arrays.toString(a));
            if (Arrays.equals(a,b)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
