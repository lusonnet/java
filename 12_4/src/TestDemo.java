import java.util.Arrays;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-04
 * Time: 16:29
 */
public class TestDemo {
    public static void main(String[] args) {
        int ret = fib(21);
        System.out.println(ret);
    }
    public static int fib(int N){
        if(N==1||N==2)return 1;
        return fib(N-1)+fib(N-2);
    }
}

class Solution {
    int[] meno;
    public int coinChange(int[] coins, int amount) {
        meno = new int[amount + 1];
        Arrays.fill(meno,-111);
        return dp(coins,amount);
    }

    public int dp(int[] coins,int amount){
        if(amount == 0)return 0;
        if(amount < 0)return -1;
        if(meno[amount] != -111){
            return meno[amount];
        }

        int res = Integer.MAX_VALUE;
        for(int coin:coins){
            int sub = dp(coins,amount - coin);
            if(sub == -1)continue;
            res = Math.min(res,sub+1);
        }
        meno[amount] = (res == Integer.MAX_VALUE)?-1:res;
        return meno[amount];
    }
}