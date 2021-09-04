package 剑指offer;

/**
 * @Name: OF10_2numWays
 * @Description:        青蛙跳台阶问题
 *          https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 * @Author: panlai
 * @Date: 2021/7/27 11:52
 */

public class OF10_2numWays {

    public int numWays(int n) {
        int a = 1;
        int b = 1;
        int sum;
        for (int i = 0; i < n; i++) {
            sum =(a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        int m = 2;
        m<<=2;
        System.out.println(m);
    }
}
