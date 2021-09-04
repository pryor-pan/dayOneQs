package 剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Remarks:         剑指 Offer 39. 数组中出现次数超过一半的数字
 *              https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 * Author:panlai
 * :Date:2021/5/31
 */
public class OF39_majorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int n:nums) {
            map.put(n,map.getOrDefault(n,0)+1);
            if (map.get(n)>nums.length/2){
                return n;
            }
        }
        return -1;
    }
}
