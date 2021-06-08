package dayoneQs.day03;

import java.util.Scanner;

/**
 * Remarks:     字符串中找出连续最长的数字串
 * Author:panlai
 * :Date:2021/5/26
 */
public class Qs01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                int j = i;
                while (j<str.length() && Character.isDigit(str.charAt(j))){
                    j++;
                }
                if (j-i>ret.length()){
                    ret = str.substring(i,j);
                }
            }
        }
        System.out.println(ret);
    }
}
