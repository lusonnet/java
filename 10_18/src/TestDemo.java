/**
 * Created by lulu
 * Description:希尔排序
 *
 * User: Administrator
 * Date: 2021-10-18
 * Time: 17:33
 */
public class TestDemo {
    public static void shell(int[] array,int gap){
        if(array==null)return;
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i-gap;
            for (; j >= 0; j-=gap) {
                if(array[j]>tmp){
                    array[j+gap] = array[j];
                }else{
                    break;
                }
            }
            array[j+gap] = tmp;

        }
    }
    public static void shellSort(int[] array){
        int gap = array.length;
        while(gap>1){
            shell(array,gap);
            gap = gap/2;
        }
        shell(array,1);
    }
    public static void main(String[] args) {
        int[] array = new int[10_0000];

    }
}
