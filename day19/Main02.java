package dayoneQs_2.day19;

import java.util.*;

/**
 * Remarks:     查找两个字符串a b中的最长公共子串。
 * Author:panlai
 * :Date:2021/6/14
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            String max = str1.length()>=str2.length()?str1:str2;
            String min = str1.length()>=str2.length()?str2:str1;
            int maxLen = 0;
            String ret = "";
            for (int i = 0; i < min.length(); i++) {
                for (int j =i+1; j <=min.length(); j++) {
                    if (max.contains(min.substring(i,j)) && j-i>maxLen){
                        maxLen =j-i;
                        ret = min.substring(i,j);
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
