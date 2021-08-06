package dayoneQs_3.day45;


import java.util.Scanner;

/**
 * @Name: Main01
 * @Description:    乒乓球筐
 * @Author: panlai
 * @Date: 2021/8/4 12:22
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            boolean flag = true;
            StringBuilder sb = new StringBuilder(sc.next());
            String str = sc.next();
            char[] chars = str.toCharArray();
            for (char ch : chars) {
                int index = sb.indexOf(String.valueOf(ch));
                if (index!=-1){
                    sb.deleteCharAt(index);
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
