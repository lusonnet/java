import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * Created by lulu
 * Description:TCP与UCP有区别
 * User: Administrator
 * Date: 2021-11-22
 * Time: 22:01
 */
public class TestDemo {
    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String str = "我是UDP方式发送的导弹";
        byte[] data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090);
        socket.send(packet);
        socket.close();
    }

    //接收端
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);//指定端口号
        byte[] buffer = new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(),0, packet.getLength()));
        //packet.getData():获取packet里面的数据;
        socket.close();
    }

    //获取本地IP
    /*@Test
    public void test1() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println("IP地址：" + addr.getHostAddress() + "，主机名：" + addr.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }*/
}
