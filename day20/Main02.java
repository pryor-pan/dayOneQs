package dayoneQs_2.day20;

import java.util.Scanner;

/**
 * Remarks:         公共子串计算
 * Author:panlai
 * :Date:2021/7/5
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            if(str1.length()>str2.length()){
                String tmp = str1;
                str1 = str2;
                str2 = tmp;
            }
            int n = 0;
            for (int i = str1.length(); i>0; i--) {
                for (int j = 0; j <= i; j++) {
                    if (str2.contains(str1.substring(j,i))){
                        n = (n>i-j?n:i-j);
                    }
                }
            }
            System.out.println(n);
        }
    }
}
