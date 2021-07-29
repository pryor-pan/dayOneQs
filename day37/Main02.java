package dayoneQs_3.day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Name: Main02
 * @Description:        mkdir
 * @Author: panlai
 * @Date: 2021/7/26 13:38
 */

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i <n ; i++) {
                strings[i] = sc.next();
            }
            Arrays.sort(strings);
            List<String> res = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (!strings[i].startsWith(strings[i-1] + "/")){
                    res.add(strings[i-1]);
                }
            }
            res.add(strings[n-1]);
            for (String s:res) {
                System.out.println("mkdir -p " +s);
            }
            System.out.println();
            
        }
    }
}
