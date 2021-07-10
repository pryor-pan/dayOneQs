package dayoneQs_2.day21;

import java.util.Scanner;

/**
 * Remarks:         MP3光标位置
 * Author:panlai
 * :Date:2021/7/8
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            String com = sc.next();
            char[] command = com.toCharArray();
            int index = 1;//坐标
            int top = 1;//当前页首
            for (char c : command) {
                if (c == 'D') {
                    if (top + 3 == index) {//若发生向下翻页
                        top = top + 1;//页首下移一位
                    }
                    index = index + 1;
                    if (index == num + 1) {//若是歌曲的最后一个
                        index = 1;
                        top = 1;//页首归一
                    }
                } else if (c == 'U') {
                    if (index == top) {//若发生向上翻页
                        top = top - 1;//页首上移一位
                    }
                    index = index - 1;
                    if (index == 0) {//若是歌曲的第一个
                        index = num;
                        top = num - 3;//页首为倒数第四个
                    }
                }
            }
            if (num < 4) {//不足四页，只有一种页面情况
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");
                }
            } else {//正常情况 输出页首 和 后面的4页
                for (int i = 1; i <= 4; i++) {
                    System.out.print(top++ + " ");
                }
            }
            System.out.println();
            System.out.println(index);

        }
    }
}
