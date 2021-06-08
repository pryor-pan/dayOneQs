package dayoneQs.day03;

import java.util.HashMap;
import java.util.Map;

/**
 * Remarks:                     数组中出现次数超过一半的数字
 * Author:panlai
 * :Date:2021/5/26
 */
public class Qs02 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap();
        int n = array.length%2==0?array.length/2:array.length/2+1;
        for (int i:array) {
            map.put(i,map.getOrDefault(i,0)+1);
            if (map.get(i)>=n){
                return i;
            }
        }
        return 0;
    }

}
