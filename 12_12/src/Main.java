/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-12
 * Time: 9:58
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a integer：");
        try{
            int i = Integer.parseInt(in.readLine());
            System.out.println("Ten times of the number："+10*i);
            in.close();
        }catch(IOException e){
            System.err.println(e.toString());
        }
    }
}
