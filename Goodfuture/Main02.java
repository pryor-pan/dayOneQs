package auttomQs.Goodfuture;

/**
 * @Name: Main02
 * @Description:        矩阵最小路径
 * @Author: panlai
 * @Date: 2021/8/23 18:52
 */

public class Main02 {
    public int minPathSum (int[][] nm) {
        // write code here
        if (nm == null || nm.length<1||nm[0].length<1){
            return 0;
        }
        int row = nm.length;
        int col = nm[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = nm[0][0];
        for (int i = 1; i < row; i++) {
            dp[i][0] = nm[i-1][0] + nm[i][0];
        }
        for (int i = 1; i < col; i++) {
            dp[0][i] = nm[0][i-1] + nm[0][i];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + nm[i][j];
            }
        }
        return dp[row-1][col-1];
    }
}
