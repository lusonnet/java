import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-24
 * Time: 17:13
 */


public class TestDemo {
    public static void func(String str1,String str2){
        if(str1==null||str2==null){
            return;
        }
        List<Character>ret = new ArrayList<>();
        for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(!str2.contains(ch+" ")){
                ret.add(ch);
            }
        }
        for(char ch:ret){
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        func("welcome to my heart","come");
    }
}

