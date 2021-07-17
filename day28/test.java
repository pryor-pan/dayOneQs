package dayoneQs_2.day28;

import java.util.Arrays;

/**
 * @Description:
 * @Author: panlai
 * @Date: 2021/7/15 23:03
 */

public class test {
    public static void main(String[] args) {
        String string = "abcdefgabcsds";
        System.out.println(string.substring(0, 13));
        System.out.println(string.substring(0, 12));
        System.out.println(string.substring(0, 11));
        System.out.println(string.substring(0, 10));
        System.out.println(string.substring(0, 9));
        System.out.println(string.substring(0, 8));
        System.out.println(string.substring(0, 7));
        System.out.println(string.substring(0, 6));
        System.out.println(string.substring(0, 5));
        System.out.println(string.substring(0, 4));
        System.out.println(string.substring(0, 3));
        System.out.println(string.substring(0, 2));
        System.out.println(string.substring(0, 1));
        System.out.println(string.substring(0, 0));
        System.out.println(string.split("ab").length);
        System.out.println(Arrays.toString(string.split("ab")));
    }
}
