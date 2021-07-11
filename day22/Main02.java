package dayoneQs_2.day22;
import java.util.Scanner;

/**
 * Remarks:     找出字符串中第一个只出现一次的字符
 * Author:panlai
 * :Date:2021/7/8
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            boolean flg = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                    System.out.println(str.charAt(i));
                    flg = true;
                    break;
                }
            }
            if (flg==false){
                System.out.println(-1);
            }
        }
    }
}
