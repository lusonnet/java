import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-15
 * Time: 22:53
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        //采用指定的编码读取txt文件
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "osw.txt"), "UTF-8");
        char[] chs = new char[1024];
        int len = 0;
        while((len=isr.read(chs))!=-1){
            System.out.println(String.valueOf(chs, 0, len));
        }
        isr.close();
    }
}