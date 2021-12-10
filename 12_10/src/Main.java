/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-10
 * Time: 16:39
 */
import java.util.*;

class Rect {
    private int length;
    private int width;

    public Rect(int length) {
        if(length < 0) {
            length = 0;
        }
        this.length = length;
        this.width = length;// 正方形宽==长
    }

    public Rect(int length, int width) {

        if(length < 0 || width < 0) {
            length = 0;
            width = 0;
        }

        this.length = length;
        this.width = width;
    }

    public int length() {
        return 2 * (length + width);
    }

    public int area() {
        return length * width;
    }

    public String toString() {// 控制输出格式
        String result = length + " " + width + " " + length() + " " + area();
        return result;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Rect rect = null;
            String s = sc.nextLine();
            String[] array = s.split(" ");

            if (array.length == 1) {
                int length = Integer.parseInt(array[0]);
                rect = new Rect(length);
            } else if (array.length == 2) {
                int length = Integer.parseInt(array[0]);
                int width = Integer.parseInt(array[1]);
                rect = new Rect(length, width);
            }
            System.out.println(rect.toString());
        }

        sc.close();
    }
}
