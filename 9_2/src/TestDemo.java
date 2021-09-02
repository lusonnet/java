import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-02
 * Time: 20:23
 */
public class TestDemo {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = array.clone();
        //int[] ret = array;
        System.out.println(Arrays.toString(ret));
    }
/*
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] copy = new int[array.length];
        System.arraycopy(array,0,copy,0,array.length);
        System.out.println(Arrays.toString(copy));
    }
*/

 /*   public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int[] ret2 = Arrays.copyOfRange(array,1,3);
        int[] ret = Arrays.copyOf(array,array.length);


        System.out.println("=======================");
        System.out.println(Arrays.toString(ret2));


    }*/



 /*   public static String myToString(int[] array) {
        if (array == null){
            return null;
        }
        if(array.length == 0){
            return "";
        }
        String ret = "[";
        for(int i = 0;i < array.length;i++)
        {
            ret = ret + array[i];
            if(i != array.length - 1)
            {
                ret = ret + ",";
            }
        }
        ret += "]";
        return ret;

    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        String ret = myToString(array);
        System.out.println(ret);
    }*/
}
