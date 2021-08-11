package dayoneQs_3.day48;

/**
 * @Name: Main01
 * @Description: 左右最值最大差
 * @Author: panlai
 * @Date: 2021/8/7 12:25
 */

public class Main01 {
    public int findMaxGap(int[] A, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i]);
        }
        return Math.max(max - A[0], max - A[n - 1]);
    }
}
