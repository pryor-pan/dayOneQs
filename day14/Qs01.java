package dayoneQs_1.day14;

import java.util.Scanner;

/**
 * Remarks:     计算日期到天数转换
 * Author:panlai
 * :Date:2021/6/8
 */
public class Qs01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            int ret = 0;
            boolean flg = false;
            if ((year%4==0&&year%100!=0)||year%400==0){
                flg = true;
            }
            int special = 0;
            if (flg){
                special = 29;
            }else{
                special = 28;
            }
            switch (month){
                case 1:
                    ret = day;
                    break;
                case 2:
                    ret = 31+day;
                    break;
                case 3:
                    ret = 31+special+day;
                    break;
                case 4:
                    ret = 31+special+31+day;
                    break;
                case 5:
                    ret = 31+special+31+30+day;
                    break;
                case 6:
                    ret = 31+special+31+30+31+day;
                    break;
                case 7:
                    ret = 31+special+31+30+31+30+day;
                    break;
                case 8:
                    ret = 31+special+31+30+31+30+31+day;
                    break;
                case 9:
                    ret = 31+special+31+30+31+30+31+31+day;
                    break;
                case 10:
                    ret = 31+special+31+30+31+30+31+31+30+day;
                    break;
                case 11:
                    ret = 31+special+31+30+31+30+31+31+30+31+day;
                    break;
                case 12:
                    ret = 31+special+31+30+31+30+31+31+30+31+30+day;
                    break;
                default:
                    break;
            }

            System.out.println(ret);
        }

    }

}
