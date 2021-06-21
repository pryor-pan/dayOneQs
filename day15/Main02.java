package dayoneQs_1.day15;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/6/9
 */
public class Main02 {


    public static int findMinimum2(int n, int[] left, int[] right) {
        // write code here
        int minLeft = Integer.MAX_VALUE,sumLeft = 0;
        int minRight = Integer.MAX_VALUE,sumRight = 0;
        int sum = 0;
        for (int i = 0;i < n;i++) {
            // 左右两边手套不管那边  只要有0 那么为了一定能配对 就必须将这个颜色的手套拿走
            if (left[i] * right[i] == 0) {
                sum += (left[i] + right[i]);
            }else {// 在剩下的颜色中 将除了颜色最小的手套拿走 并且再拿一只颜色最少的 这样就能保证所有颜色都取到了
                sumLeft += left[i];
                sumRight += right[i];
                minLeft = Math.min(minLeft,left[i]);
                minRight = Math.min(minRight,right[i]);
            }
        }
        // 比较左右两边需要拿的个数 将需要拿的少的一边取出  再在另外一边取一只  这样在另一边取到的这一只有颜色相同的另一只
        return sum + Math.min((sumLeft - minLeft + 1),(sumRight - minRight + 1)) + 1;
    }
    public static void main(String[] args) {
        int[] arr1= {0,7,1,6};
        int[] arr2= {1,5,0,6};
        System.out.println(findMinimum2(4, arr1, arr2));
    }
}
