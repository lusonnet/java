/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-27
 * Time: 22:28
 */
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1) return 1;
        int[] arr = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            arr[trust[i][1]]++;
            arr[trust[i][0]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n - 1) {
                return i;
            }
        }
        return  -1;
    }
}

