import org.junit.Test;

import java.util.*;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-30
 * Time: 18:48
 */
public class TestDemo {
    /*@Test
    public void test(){
        Map map = new HashMap();
        map.put(null,null);
    }*/

    public static void main(String[] args) {
        int[] array = new int[10_000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10_000);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i])){
                System.out.println(array[i]);
                break;
            }
            set.add(array[i]);
        }

    }








    public static void main1(String[] args) {
        Map<String,String> map = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();
        map.put("aa","a");
        map.put("bb","b");
        map.put("cc","c");

        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry<String,String> entry: set) {
            System.out.println("key: "+entry.getKey()+" value:"+entry.getValue());
        }
    }


}
