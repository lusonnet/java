/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-01
 * Time: 18:00
 */

/**
 * 时间复杂度：O(n^1.3~1.5)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 *
 */


public class TestDemo {
    public static void createBigHeap(int[] array){

    }

    public static void heapSort(int[] array){

    }





    /**
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void shell(int[] array,int gap){
        if(array==null)return;
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i-gap;
            for (; j >=0; j-=gap) {
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
        int gap = array.length-1;
        while(gap>1){
            shell(array,gap);
            gap = gap/2;
        }
        shell(array,gap);
    }
}
