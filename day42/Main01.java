package dayoneQs_3.day42;

import java.util.Scanner;

/**
 * @Name: Main01
 * @Description:            解读密码
 * @Author: panlai
 * @Date: 2021/7/31 12:09
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)){
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
