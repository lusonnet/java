import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-22
 * Time: 22:42
 */
public class URLtest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://strawhatfy.github.io/2015/07/30/TCP-IP-Protocol/tcp_ip_layers_other.png");
            System.out.println(url.getProtocol());
            System.out.println(url.getFile());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getPort());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
