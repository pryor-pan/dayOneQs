package dayoneQs_3.day44;

import java.util.Scanner;

/**
 * @Name: Main02
 * @Description:        单词倒排
 * @Author: panlai
 * @Date: 2021/8/4 9:34
 */

public class Main02 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] sp = sc.nextLine().split("[^a-zA-Z]+");
        StringBuilder sb = new StringBuilder();
        for (int i = sp.length - 1; i >= 0; i--)
            sb.append(sp[i] + " ");
        System.out.println(sb.toString().trim());
        sc.close();
    }
}
