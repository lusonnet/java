/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-13
 * Time: 20:28
 */
/*
public class HomeWork {

}
import java.util.ArrayList;
        import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        int len = pushA.length;
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0,j = 0;i < len;i++){

            s.push(pushA[i]);
            while(j<len && s.peek() == popA[j]&& !s.isEmpty() ){
                s.pop();
                j=j+1;
            }
        }
        return s.empty();
    }
}

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int count = 0;

        for(int i = 0;i<ops.length;i++){
            if(ops[i].equals("C")){
                count -= stack.pop();
            }else if(ops[i].equals("D")){
                int n = stack.peek()*2;
                count += n;
                stack.push(n);
            }else if(ops[i].equals("+")){
                int p = stack.pop();
                int q = stack.peek()+p;
                count += q;
                stack.push(p);
                stack.push(q);
            }else{
                int n = Integer.parseInt(ops[i]);
                count += n;
                stack.push(n);
            }
        }

        return count;
    }
}*/
