package 剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Remarks:     剑指 Offer 03. 数组中重复的数字
 *          https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * Author:panlai
 * :Date:2021/5/31
 */
public class OF03_findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > 1) {
                return n;
            }
        }
        return -1;
    }
}