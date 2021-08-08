package dayoneQs_3.day46;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.WeakHashMap;

/**
 * @Name: Main02
 * @Description:            简单错误记录
 * @Author: panlai
 * @Date: 2021/8/5 17:34
 */

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        while (sc.hasNext()){
            String str = sc.next();
            int line = sc.nextInt();
            String[] arr = str.split("\\\\");
            String s = arr[arr.length-1];
            if (s.length()>16){
                s = s.substring(s.length()-16);
            }
            String key = s + " " +line;
            int value = 1;
            if(map.containsKey(key))
                map.put(key, map.get(key)+1);
            else {
                map.put(key, value);
            }
        }
        int count = 0;
        for (String string : map.keySet()) {
            count++;
            if (count>map.keySet().size()-8){
                System.out.println(string + " " + map.get(string));
            }
        }
    }


}
