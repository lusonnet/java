import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-04
 * Time: 19:38
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Class<?> c1 = null;
        try {
            c1 = Class.forName("TestDemo2.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test1(){
        File file1 = new File("hello.txt");
        File file2 = new File("d:\\io\\hi.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        System.out.println();
    }


    @Test
    public void test2() throws IOException {
        File file1 = new File("hi.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else {
            file1.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test3(){
        File file1 = new File("d:\\io\\io1");
        boolean mkdir = file1.mkdir();
        if(mkdir){
            System.out.println("创建成功1");//创建失败
        }
        File file2 = new File("d:\\io\\io2");
        boolean mkdir1 = file1.mkdirs();
        if(mkdir){
            System.out.println("创建成功2");//成功创建 - 上层没有用mkdirs()
        }
    }

    /*@Test
    public List<String> getVal(HashMap<String,String> map){
        ArrayList<String> value = new ArrayList<>();
        Collection<String> values = new ArrayList<>();
        for (String value2:values) {
            value.add(values);
        }
        return value;
    }*/
}
