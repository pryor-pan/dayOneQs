package dayoneQs_3.day46;

import java.util.Arrays;

/**
 * @Name: Main01
 * @Description:        数组中出现次数超过一半的数字
 * @Author: panlai
 * @Date: 2021/8/5 17:34
 */

public class Main01 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
