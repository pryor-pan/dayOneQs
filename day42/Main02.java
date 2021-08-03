package dayoneQs_3.day42;

import java.util.Scanner;

/**
 * @Name: Main02
 * @Description:               走迷宫
 * @Author: panlai
 * @Date: 2021/7/31 12:09
 */

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            Character[][] maze = new Character[10][10];
            for (int i = 0; i < 10; i++) {
                String str = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    maze[i][j] = str.charAt(j);
                }
            }

            int[][] miniPath = new int[10][10];
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if (maze[i][j] == '.'){

                    }
                }
            }








        }


    }
}
