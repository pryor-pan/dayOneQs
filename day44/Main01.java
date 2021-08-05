package dayoneQs_3.day44;

import java.util.Scanner;

/**
 * @Name: Main01
 * @Description:        骆驼命名法
 * @Author: panlai
 * @Date: 2021/8/4 9:34
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String sCpp = sc.nextLine();
            String[] strings = sCpp.split("_");
            for (int i = 0; i < strings.length; i++) {
                if (i!=0){
                    String str = strings[i];
                    String str1 = str.substring(0,1);
                    String str2 = str.substring(1);
                    str1 = str1.toUpperCase();
                    str = str1 + str2;
                    strings[i] = str;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strings.length ; i++) {
                sb.append(strings[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
