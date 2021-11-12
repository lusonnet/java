import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-12
 * Time: 16:16
 */
public class TestDemo {
    @Test
    public void test() throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("中国人不骗中国人.txt");
            fos = new FileOutputStream("中国人不骗中国人2.txt");
            byte[] buffer = new byte[20];
            int len;
            while((len = fis.read(buffer))!=-1){
                //加密
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte)(buffer[i] ^5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){

    }
}
