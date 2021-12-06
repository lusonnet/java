/**
 * Created by lulu
 * Description:快排
 * User: Administrator
 * Date: 2021-12-06
 * Time: 20:12
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,4,2,9,34,21,11};
        quickSort(array);

    }
    public static int partition(int[] array,int start,int end){
        int temp = array[start];
        while(start < end){
            while(start<end && array[end]>=temp){//从后面找比基准小的数
                end--;
            }
            array[start] = array[end];
            while(start<end && array[start]<=temp){
                start++;
            }
            array[end] = array[start];
        }
        array[start] = temp;
        return start;
    }
    public static void quick(int[] array,int left,int right){
        if(left >= right ){
            return;
        }
        int pivot = partition(array,left,right);
        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }

    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }
}
