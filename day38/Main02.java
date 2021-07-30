package dayoneQs_3.day38;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null) {
            String[] params = line.trim().split(" ");
            int n = Integer.parseInt(params[0]);
            int m = Integer.parseInt(params[1]);
            int k = Integer.parseInt(params[2]);
            int[][] grid = new int[n + 1][m + 1];
            int x, y;
            for(int i = 0; i < k; i++){
                params = br.readLine().trim().split(" ");
                x = Integer.parseInt(params[0]);
                y = Integer.parseInt(params[1]);
                grid[x][y] = 1;
            }
            double[][] dp = new double[n + 1][m + 1];
            dp[1][1] = 1.0;     // 初始化起点的概率
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(i == 1 && j == 1) continue;
                    // 只要当前位置没有蘑菇，就可以从上面或者左边移动到当前位置
                    if(grid[i][j] == 0)
                        dp[i][j] = (j == m? 1: 0.5)*dp[i - 1][j] + (i == n? 1: 0.5)*dp[i][j - 1];
                }
            }
            System.out.printf("%.2f\n", dp[n][m]);
        }
    }
}