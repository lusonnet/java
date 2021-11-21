/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-21
 * Time: 18:40
 */
import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        final int HUMANNUM=10;
        String[] persons=new String[HUMANNUM];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<persons.length;i++)
            persons[i]=in.nextLine();
        int result=numofHan(persons);
        System.out.println(result);

    }

    /*在此处给出函数numofHan()*/
    public static int numofHan(String data[]){
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i].contains("汉族")){
                count++;
            }
        }
        return count;
    }

}


