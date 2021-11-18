import jdk.jfr.StackTrace;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * Created by lulu
 * Description:客户端IP是线，端口是插头，服务端是插板
 * User: Administrator
 * Date: 2021-11-18
 * Time: 20:41
 */
public class TestDemo2 {
    @Test//客户端
    public void client(){
        Socket socket = null;
        OutputStream os = null;
        try {
            //创建Socket对象，指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8899);
            //获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            //写出数据的操作
            os.write("你好，我是客户端".getBytes());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //资源的关闭
            if(os!=null)
            {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(socket!=null)
            {
                try {
                    socket.close();//socket也是资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /*byte[] buffer = new byte[20];
            int len;
            while((len = is.read(buffer))!=-1){
                String str = new String(buffer,0,len);
                System.out.println();
            }*/
    @Test//服务端
    public void server() throws IOException {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try{
            //创建服务器端的ServerSocket，指明自己的端口号
            ss = new ServerSocket(8899);
            //调用accept()来表示接收来自于客户端的socket
            socket = ss.accept();
            //获取输入流
            is = socket.getInputStream();
            //读取输入流的数据
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[20];
            int len;
            while((len = is.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(baos != null){
                try{
                    baos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(is != null){
                try{
                    is.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try{
                    socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(ss != null){
                try{
                    ss.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
