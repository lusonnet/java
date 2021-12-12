import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-12
 * Time: 10:22
 */

import java.io.*;
public class TestDemo{
    public static void main(String args[ ]){
        try{  FileReader inOne=new FileReader("a.txt");
            BufferedReader inTwo= new BufferedReader(inOne);
            FileWriter tofile=new FileWriter("hello.txt");
            BufferedWriter out= new BufferedWriter(tofile);
            String s=null;
            while((s=inTwo.readLine())!=null){
                out.write(s);
                out.newLine();
            }
            out.flush();
            out.close();
            tofile.close();
            inOne=new FileReader("hello.txt");
            inTwo= new BufferedReader(inOne);
            while((s=inTwo.readLine())!=null){
                System.out.println(s);
            }
            inOne.close();
            inTwo.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }

}