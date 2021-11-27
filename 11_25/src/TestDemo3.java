import org.junit.Test;

import java.util.Date;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-25
 * Time: 21:10
 */
public class TestDemo3 {
    public static void main(String[] args) {
        String s = "hello";
        try {
            s = s+" world";
            s.toUpperCase();
            String[] a = s.split("o");
            System.out.println(a.length);
        } catch (Exception e) {
            System.out.print(s);
        } finally {
            System.out.print(s);
        }}}
