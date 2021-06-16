package dayoneQs_1.day11;

/**
 * Remarks:         LCA最近公共祖先
 * Author:panlai
 * :Date:2021/6/4
 */
public class Qs01 {
    public static int getLCA(int a, int b) {
        // write code here
        while (a!=b){
            if (a>b){
                a >>= 1;
            }else {
                b >>= 1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getLCA(9, 8));
    }
}
