package dayoneQs_2.day18;

import java.util.Scanner;

/**
 * Remarks:         统计每个月兔子的总数
 * Author:panlai
 * :Date:2021/6/13
 */
public class Main01 {
    public static int getTotalCount(int monthCount){
        if (monthCount ==1 || monthCount ==2){
            return 1;
        }
        return getTotalCount(monthCount-1) + getTotalCount(monthCount-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(getTotalCount(m));
    }
}
