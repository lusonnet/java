package com.home.java;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
}
