import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-17
 * Time: 22:09
 */
public class TestDemo {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getLocalHost();//获取本地IP
            System.out.println(inet2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
