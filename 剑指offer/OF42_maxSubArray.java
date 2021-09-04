package 剑指offer;

/**
 * @Name: OF42_maxSubArray
 * @Description:        最大连续子数组的和
 *      https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * @Author: panlai
 * @Date: 2021/7/27 13:11
 */

public class OF42_maxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums==null){
            return 0;
        }
        int ret = nums[0];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.max(nums[i-1]+nums[i],nums[i]);
            ret = Math.max(ret,nums[i]);
        }
        return ret;
    }
}
