import java.util.*;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-23
 * Time: 19:05
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民男神","朱一龙");
        System.out.println(map);
        map.put("aa","a");
        map.put("bb","b");
        System.out.println(map);

        String v = map.getOrDefault("aaa","小笼包");
        System.out.println(v);//小笼包

        System.out.println(map.size());//4

        System.out.println(map.containsKey("aa"));//true
        System.out.println(map.containsValue("a"));//true
        System.out.println("==================");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry:entrySet ) {
            System.out.println(entry);//打印顺序是随机的
        //aa=a
        //bb=b
        //国民女神=高圆圆
        //国民男神=朱一龙
        }
    }





    public static void main3(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.remove("a");//3.
        System.out.println(collection);

        Object[] objects = collection.toArray();//
        System.out.println(Arrays.toString(objects));//4.

        collection.clear();//2.
        System.out.println(collection.size());
    }
    public static void main1(String[] args) {
        Collection<String>collection = new ArrayList<>();
        Collection<Integer>collection1 = new LinkedList<>();
        Collection<String>collection2 = new Stack<>();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("he");//1.



    }
}
