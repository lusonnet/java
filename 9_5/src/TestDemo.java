/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-06
 * Time: 22:34
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.display();
        myArrayList.remove(3);
        myArrayList.display();
       /* System.out.println(myArrayList.contains(4));
        System.out.println(myArrayList.search(-10));*/
    }
}


