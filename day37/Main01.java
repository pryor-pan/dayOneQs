package dayoneQs_3.day37;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Name: Main01
 * @Description:        数据库连接池
 *
 * @Author: panlai
 * @Date: 2021/7/26 13:38
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String[] strings = new String[2*n];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = sc.next();
            }
            Queue<String> queue = new LinkedList<>();
            int  length = 0;
            for (int i = 1; i <strings.length ; i+=2) {
                if (strings[i].equals("connect")){
                    queue.add(strings[i-1]);

                }
                if (strings[i].equals("disconnect")){
                    if (queue.size()>length){
                        length = queue.size();
                    }
                    queue.remove(strings[i-1]);
                }
            }
            System.out.println(length);

        }

    }

}
