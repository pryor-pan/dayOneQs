package 剑指offer;

/**
 * Remarks:         剑指 Offer 15. 二进制中1的个数
 *                  https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 *
 * Author:panlai
 * :Date:2021/5/31
 */
public class OF15_hammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
