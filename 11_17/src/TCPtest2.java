import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-18
 * Time: 22:05
 */
public class TCPtest2 {
    @Test
    public void cilent() throws IOException {
        //创建Socket对象，指明服务器端的ip和端口号
        Socket socket = new Socket(InetAddress.getByName("185.5.4.3"),9090);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        //获取输入流
        FileInputStream fis = new FileInputStream(new File("OIP.jpg"));
        //读和写
        byte[] buffer = new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        fis.close();
        os.close();
        socket.close();
    }

    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();
        //获取客户端输入流
        InputStream is = socket.getInputStream();
        //保存数据到本地
        FileOutputStream fos = new FileOutputStream(new File("OIP1.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        fos.close();
        is.close();
        socket.close();
        fos.close();
    }
}
