package dayoneQs_2.day26;/*
 *
 *
 */

public class Main01 {
    public static int  jumpFloorII(int target){
        if (target == 1) return 1;
        return 2 * jumpFloorII(target - 1);
    }
}
