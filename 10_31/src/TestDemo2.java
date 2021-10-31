/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-31
 * Time: 22:34
 */
public class TestDemo2 {
    public void insertSort(int[] array){
        if(array == null)return;
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >=0; j++) {
                if(array[j] > tmp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = tmp;
        }

    }

    public static void main(String[] args) {
        int[] array = {4,1,7,3};
        insertSort(array);
        System.out.println(array);
    }
}
