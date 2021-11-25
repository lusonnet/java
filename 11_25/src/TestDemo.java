import java.io.IOException;
import java.util.Scanner;

/**
 * Created by lulu
 * Description:sdut-String--判定Java源文件名称
 * User: Administrator
 * Date: 2021-11-25
 * Time: 20:36
 */
public class TestDemo {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] s1 = s.split("\\.");
            boolean t = true;
            if (s1.length == 2) {
                if (!legal(s1[0]) || !s1[1].equals("java")) {
                    t = false;
                }
            } else
                t = false;
            System.out.println(t);
        }
        in.close();
    }

    public static boolean legal(String str) {
        boolean t = true;
        if (Character.isJavaIdentifierStart(str.charAt(0))) {
            for (int i = 1; i < str.length(); i++) {
                if (!Character.isJavaIdentifierPart(str.charAt(i))) {
                    t = false;
                    break;
                }
            }
        } else
            t = false;
        return t;
    }
}
