import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2022-01-17
 * Time: 11:08
 */
public class Main {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] nums = new int[3*n];
            for(int i = 0;i<3*n;i++){
                int a = scanner.nextInt();
                nums[i] = a;
            }
            Arrays.sort(nums);
            System.out.println(nums[3*n-2]+nums[3*n-3]);
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] ch = str1.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(!str2.contains(String.valueOf(ch[i]))){
                System.out.print(ch[i]);
            }
        }


    }
}
