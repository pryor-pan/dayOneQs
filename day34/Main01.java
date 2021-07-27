package dayoneQs_3.day34;

import java.util.Scanner;

/**000
 * @Description:            收件人列表
 * @Author: panlai
 * @Date: 2021/7/22 18:16
 */

public class Main01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] strings = new String[n];
            for (int i = 0; i < strings.length; i++) {
                String str = sc.nextLine();
                if (str.contains(",") || str.contains(" ")){
                    str = "\"" + str + "\"";
                }
                strings[i] = str;
            }
            for (int i = 0; i < strings.length; i++) {

                System.out.print(strings[i]);
                if (i!=n-1){
                    System.out.printf(", ");
                }
            }
            System.out.println();
        }
    }

}
