package com.home.java;

import org.junit.Test;

import java.io.*;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-10
 * Time: 21:19
 */
public class TestDemo3 {
    @Test
    public void testFileReader() throws IOException {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);

            //数据的读入
            int data = fr.read();
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);//hello
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                //流的关闭
                if(fr!=null){
                    fr.close();//保证已经实例化成功
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileReader1() throws IOException {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);

            //数据的读入
            /*char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf))!=-1){
                for (int i = 0; i < cbuf.length; i++) {
                    System.out.println(cbuf[i]);
                }
            }*/


            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf))!=-1){
                /*String str = new String(cbuf);
                System.out.println(str);*/

                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                //流的关闭
                if(fr!=null){
                    fr.close();//保证已经实例化成功
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileWrite()  {
        FileWriter fw = null;
        try {
            File file = new File("hello1.txt");
            fw = new FileWriter(file);
            fw.write("I have a dream");
            fw.write("you need to have a dream");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileReaderFileWrite()  {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.提供File的对象，指明写出和读入的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");
            //2.创建输入流和输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);
            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf))!=-1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭文件流
                try {
                    if(fw!=null){
                        fw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void BufferStreamTest() throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcfile = new File("中国人不骗中国人.jpg");
            File desfile = new File("中国人不骗中国人1.jpg");

            fis = new FileInputStream(srcfile);
            fos = new FileOutputStream(desfile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭顺序：先关闭外层，再关闭内层
            try {
                if(bis!=null){
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //fis.close();//可省略
            //fos.close();//可省略
        }
    }

    @Test
    public void copyFileBufferStream(){

    }
}
