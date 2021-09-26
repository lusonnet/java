/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-26
 * Time: 20:55
 */

class Node {
    public int data;
   // public TestDemo1.Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class TestDemo2 {
        private Node front;
        private Node rear;
        private int usedSize;

        /**
         * 入队列
         * @param val 值
         */
        public void offer(int val) {

            usedSize++;
        }

        /**
         * 出队头元素
         * @return
         */
        public int poll() {
            return -1;
        }

        /**
         * 得到队头元素 但是不删除
         */
        public void peek() {

        }

        public boolean isEmpty() {
            return false;
        }

        public int size() {
            return -1;
        }



}
