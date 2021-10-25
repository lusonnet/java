package generic;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-24
 * Time: 14:45
 */
//泛型类
class Algorithm <T extends Comparable<T>>{
    public T findMax(T[] array){
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i]) < 0){
                max = array[i];
            }
        }
        return max;
    }
}

class Algorithm2{
    //泛型方法
    public static<T extends Comparable<T>> T findMax(T[] array){
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i]) < 0){
                max = array[i];
            }
        }
        return max;
    }
}

/*public static void printAll(MyArrayList<? super Integer>list){

}*/

public class TestDemo2 {
    public static void main(String[] args) {
        Algorithm<Integer> algorithm = new Algorithm<>();
        Integer[] array = {1,3,7,2,11,9};
        Integer ret = algorithm.findMax(array);
        System.out.println(ret);

    }
}
