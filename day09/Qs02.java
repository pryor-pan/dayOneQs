package dayoneQs_1.day09;

import java.util.Scanner;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/6/1
 */
public class Qs02 {
    public static void main1(String ... args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            // n个格子就有n + 1条线
            int n = sc.nextInt() + 1, m = sc.nextInt() + 1;
            // 避免处理边界问题（实际上空间消耗增加了）
            int[][] d = new int[n + 1][m + 1];
            // 初始子问题：只有一个点时有一条路，其他时候都为它上面的路和加左边的路和
            d[1][1] = 1;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    d[i][j] += d[i - 1][j] + d[i][j - 1];
                }
            }
            System.out.println(d[n][m]);
        }
    }

    public static void func(StringBuilder a,StringBuilder b){
        a.append(b);
        b = a;
    }
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("a");
        StringBuilder b = new StringBuilder("b");
        func(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
