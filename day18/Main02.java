package dayoneQs_2.day18;

import java.util.Scanner;

/**
 * Remarks:         字符串通配符
 * Author:panlai
 * :Date:2021/6/13
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String zhengze = sc.next();
            String s = sc.next();
            zhengze = zhengze.replaceAll("\\?", "[\\\\w]{1}");
            zhengze = zhengze.replaceAll("\\*", "[\\\\w]*");
            System.out.println(s.matches(zhengze));
        }
    }
}
