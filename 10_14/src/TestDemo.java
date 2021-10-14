import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by lulu
 * Description:死锁
 * a锁里面有b锁；b锁里面有a锁
 * User: Administrator
 * Date: 2021-10-14
 * Time: 19:19
 */
public class TestDemo {
    /*
    求前k个大的数
     */
    public static int[] topK(int[] array,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            if(queue.size()<k){
                queue.offer(array[i]);
            }else{
                int top = queue.peek();
                if(top<array[i]){
                    queue.poll();
                    queue.offer(array[i]);
                }
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll();
        }
        return ret;

    }

    public static void main(String[] args) {
        int[] array = {23,53,33,54,35,12,36,76,41,1};
        int[] ret = topK(array,3);
        System.out.println(Arrays.toString(ret));
    }




    /*public static void main2(String[] args) {
        TestDemo testHeap = new TestDemo();
        int[] array = {23,53,33,54,35,12,36,76,41,1};
        testHeap.createBigHeap(array);
        System.out.println(testHeap.poll());
    }*/

    public static void main1(String[] args) {
        /*StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread(){
            @Override
            public void run(){
                synchronized (s1){
                    s1.append("a");
                    s2.append("1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run(){
                synchronized (s2){
                    s1.append("c");
                    s2.append("3");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2){
                        s1.append("d");
                        s2.append("4");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();*/



    }

}
