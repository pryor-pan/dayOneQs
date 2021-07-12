package dayoneQs_2.day23;

import java.util.Arrays;


/**
 * Remarks:         微信红包
 * Author:panlai
 * :Date:2021/7/9
 */
public class Main01 {
    public int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i]==ans){
                num++;
            }
        }
        return num<=n/2?0:ans;
    }
}
