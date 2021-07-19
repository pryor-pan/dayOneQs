package dayoneQs_2.day30;

import java.util.Scanner;

/**
 * @Description:        最难的问题
 * @Author: panlai
 * @Date: 2021/7/17 22:26
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        while (sc.hasNext()) {
            String str = sc.nextLine();
            for (int i = 0;i<str.length();i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <='E') {
                    result.append((char)(str.charAt(i)+21));
                }else if(str.charAt(i) > 'E' && str.charAt(i) <='Z') {
                    result.append((char)(str.charAt(i) - 5));
                }else if (str.charAt(i) == ' ') {
                    result.append(' ');
                }
            }
            System.out.println(result);
            result.setLength(0);
        }
    }
}
