import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-18
 * Time: 22:30
 */
public class TCPtest3 {
    @Test
    public void cilent() throws IOException {
        //创建Socket对象，指明服务器端的ip和端口号
        Socket socket = new Socket(InetAddress.getByName("192.168.43.90"),8090);
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
        //关闭数据的输出
        socket.shutdownOutput();
        //接收来自于服务器端的数据，并显示到后台
        InputStream is = socket.getInputStream();
        //防止产生乱码
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bufferr = new byte[20];
        int len1;
        while((len1=is.read(bufferr))!=-1){
            baos.write(bufferr,0,len1);
        }
        System.out.println(baos.toString());


        fis.close();
        os.close();
        socket.close();
        baos.close();
    }

    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(8090);
        Socket socket = ss.accept();
        //获取客户端输入流
        InputStream is = socket.getInputStream();
        //保存数据到本地
        FileOutputStream fos = new FileOutputStream(new File("OIP2.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        //服务器给与客户端反馈
        OutputStream os = socket.getOutputStream();
        os.write("你好，美女,我已收到".getBytes());
        fos.close();
        is.close();
        socket.close();
        ss.close();
        os.close();
    }
}
