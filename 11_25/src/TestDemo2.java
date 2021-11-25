import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-25
 * Time: 20:49
 */
public class TestDemo2 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//字符串
        char[] ss = str.toCharArray();
        String key1 = sc.next();//数字
        String[] key2 = key1.split("");
        int[] key = new int[key2.length];
        int j;
        for(j=0;j<key.length;j++){
            key[j] = Integer.parseInt(key2[j]);
        }
        j=0;
        for(int i = 0;i<ss.length;i++){
            if(i==5){
                j=0;
            }
            ss[i] += key[j++];
            System.out.println(ss[i]);
        }
    }*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("，");
        for(String s:str){
            String[] ss = s.split("/");
            System.out.println(ss[ss.length-1]+"；");
        }

    }
}
