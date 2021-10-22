import java.util.Stack;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-21
 * Time: 20:21
 */
public class TestDemo {
    public static int patation(int[] array,int start,int end){
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
    public static void quickSort(int[] array){
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int end = array.length - 1;
        int par = patation(array,start,end);
        if(par>start+1){
            stack.push(start);
            stack.push(par-1);

        }
        if(par<end-1){
            stack.push(par+1);
            stack.push(end);
        }
        while (!stack.empty()){
            end = stack.pop();
            start = stack.pop();
            par = patation(array,start,end);//重新找基准
            if(par>start+1){
                stack.push(start);
                stack.push(par-1);

            }
            if(par<end-1){
                stack.push(par+1);
                stack.push(end);
            }
        }
    }

}
