package dayoneQs.day01;

import java.util.Scanner;

/**
 * Remarks:     删除公共字符
 * Author:panlai
 * :Date:2021/5/24
 */
public class Qs02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char ch1 : str1.toCharArray()) {
            boolean flg = true;
            for (char ch2:str2.toCharArray()) {
                if (ch1 == ch2){
                    flg = false;
                    break;
                }
            }
            if (flg){
                sb.append(ch1);
            }
        }
        System.out.println(sb.toString());
    }
}
