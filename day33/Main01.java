package dayoneQs_3.day33;

import java.util.Scanner;

/**
 * @Description:
 * @Author: panlai
 * @Date: 2021/7/21 19:40
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String t = sc.next();
            int i = 0;
            int count = 0;
            while (i<=s.length()-t.length()){
                if (s.charAt(i) == t.charAt(0)){
                    boolean isFind = true;
                    int u = i;
                    for (int j = 0; j < t.length(); j++) {
                        if (s.charAt(u) == t.charAt(j)){
                            u++;
                        }else {
                            isFind = false;
                            break;
                        }
                    }
                    if (isFind){
                        count++;
                        i += s.length();
                    }else {
                        i++;
                    }
                }else {
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}
