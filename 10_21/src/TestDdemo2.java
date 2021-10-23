import java.util.Arrays;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-22
 * Time: 20:35
 */


/**
 * 合并两个有序序列
 */

/**
 * 时间复杂度：O(N*logn)
 * 空间复杂度：O(n)
 * 稳定性：稳定
 */
public class TestDdemo2 {

    public static void merge(int[] array,int left,int right,int mid){//合并
        int[] array3 = new int[right-left+1];
        int k = 0;
        int s1 = left;
        int s2 = mid+1;
        while(s1<=mid&&s2<=right){
            if(array[s1]<=array[s2]){
                array3[k++] = array[s1++];
            }else{
                array3[k++] = array[s2++];
            }
        }
        while(s1<=mid){
            array3[k++] = array[s1++];
        }
        while(s2<=right){
            array3[k++] = array[s2++];
        }
        for (int i = 0; i < k; i++) {
            array[i+left] = array3[i];//排好序的数字放到原来的数组
        }
    }
    public static void mergeSortInternal(int[] array,int left,int right){//分解
        if(left>=right)return;
        int mid = (left+right)/2;
        mergeSortInternal(array,left,mid);//分解
        mergeSortInternal(array,mid+1,right);
        merge(array,left,right,mid);//合并
    }

    public static void merge2(int[] array,int gap){
        int[] tmp = new int[array.length];
        int k = 0;
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 >= array.length?array.length-1:s2+gap-1;
        while(s2< array.length){//一定有两个段
            while(s1<=e1&&s2<=e2){
                if(array[s1]<=array[s2]){

                }
            }
        }
        while(s1<=e1){
            tmp[k++]= array[s1++];

        }
    }
    public static void mergeSort(int[] array){
        // mergeSortInternal(array,0, array.length-1);

    }

    public static int[] mergeArray(int[] array1,int[] array2){
        int[] array3 = new int[array1.length+array2.length];
        int s1 = 0,i = 0;
        int e1 = array1.length - 1;
        int s2 = 0;
        int e2 = array2.length - 1;
        while(s1<=e1 && s2<=e2){
            if(array1[s1] <= array2[s2]){//‘<=’维持稳定性
                array3[i++] = array1[s1++];
            }else{
                array3[i++] = array2[s2++];
            }

        }
        while(s1<=e1){
            array3[i++] = array1[s1++];
        }
        while(s2<=e2){
            array3[i++] = array2[s2++];
        }
        return array3;
    }
    public static void main1(String[] args) {
        int[] array1 = {1,3,5,7,8};
        int[] array2 = {2,4,6,7,10,25};
        int[] ret = mergeArray(array1,array2);
        System.out.println(Arrays.toString(ret));
    }

    public static void main(String[] args) {
        int[] array = {4,2,6,8,3,1};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
