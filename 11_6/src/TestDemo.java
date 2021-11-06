/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-06
 * Time: 16:45
 */
public class TestDemo {
    /**
     * 时间复杂度：O(N*logN)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     * @param parent
     * @param len
     */
    public static void shiftDown(int[] array,int parent,int len){//向下调整
        int child = 2*parent+1;
        while(child<len){
            if( child+1 < len && array[child] < array[child+1]){
                child++;
            }
            if(array[child]>array[parent]){
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            }else{
                break;
            }
        }
    }

    public static void creatBigHeap(int[] array){
        for(int i = (array.length-1-1)/2;i>=0;i--){
            shiftDown(array,i,array.length);
        }
    }

    public static void heapSort(int[] array){
        creatBigHeap(array);
        int end = array.length-1;
        while(end>0){
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            shiftDown(array,0,end);
            end--;
        }
    }


    /**
     * 时间复杂度：O(N^2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     * @param array
     */

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-i; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(!flg ){//优化 - 有序了就不交换
                break;
            }
        }
    }
    public static void main(String[] args) {

    }
}
