package 剑指offer;

/**
 * @Name: OF10_1fibonacci
 * @Description: 斐波那契数列
 *              https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * @Author: panlai
 * @Date: 2021/7/27 11:30
 */

public class OF10_1fibonacci {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int fn = 0;
        if (n <= 1) {
            return n;
        }
        for (int i = 2; i < n; i++) {
            fn = (a + b) % 1000000007;
            a = b;
            b = fn;
        }
        return fn;
    }
}
