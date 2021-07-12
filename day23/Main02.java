package dayoneQs_2.day23;

import java.util.Scanner;

/**
 * Remarks:         计算字符串的距离
 * Author:panlai
 * :Date:2021/7/9
 */
public class Main02 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str1 = in.next();
            String str2 = in.next();
            System.out.println(LevenshteinDistance(str1, str2));
        }
        in.close();
    }
    public static int LevenshteinDistance(String str1, String str2){
        if(str1.length() == 0)
            return str2.length();
        if(str2.length() == 0)
            return str1.length();
        int dp[][] = new int[str1.length() + 1][str2.length() + 1];
        for(int i = 0; i < str1.length() + 1; i++)
            dp[i][0] = i;
        for(int j = 0; j < str2.length() + 1; j++)
            dp[0][j] = j;
        for(int i = 1; i < str1.length() + 1; i++){
            for(int j = 1; j < str2.length() + 1; j++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]),dp[i][j - 1]) + 1;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
