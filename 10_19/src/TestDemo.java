import java.util.Arrays;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-20
 * Time: 21:44
 */

/**
 * 时间复杂度：O(N*logN)
 * 空间复杂度：O(logN)
 * 稳定性：不稳定
 */

public class TestDemo {
    public static int partition(int[] array,int start,int end) {
        int tmp = array[start];
        while (start < end) {
            //1、先判断后面
            while(start<end&&array[end]>=tmp){//=号避免相同数字end不--
                end--;
            }

            //1.1 后面的给start  array[start] = array[end]
            array[start] = array[end];

            //2、再判断前边
            while(start<end&&array[start]<=tmp){
                start++;
            }
            //2.1 把这个大的给end  array[end] = array[start]
            array[end] = array[start];
        }
        array[start] = tmp;
        return start;//返回位置
    }

    public static void midthree(int[] array,int left,int right){
        int mid = (left+right)/2;
        if(array[left]<array[mid]){
            int tmp = array[left];
            array[left] = array[mid];
            array[mid] = tmp;
        }
        if(array[left]<array[right]){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
        if(array[right]<array[mid]){
            int tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;
        }
        //mid <= left <= right
    }
    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }

        midthree(array,left,right);//优化

        int pivot = partition(array,left,right);
        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = {2,5,1,7,3};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

}
