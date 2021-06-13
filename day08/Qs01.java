package dayoneQs_1.day08;


import java.util.Scanner;


/**
 * Remarks:     两种排序方法
 * Author:panlai
 * :Date:2021/5/31
 */
public class Qs01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String[] strings = new String[n+1];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = sc.nextLine();
            }
            boolean lenSort = true;
            boolean wordSort = true;
            for (int i = 0; i < strings.length-1; i++) {
                if (strings[i].compareTo(strings[i+1])>0){
                    wordSort = false;
                }
            }
            for (int i = 0; i < strings.length-1; i++) {
                if (strings[i].length()>strings[i+1].length()){
                    lenSort = false;
                }
            }
            if (lenSort  && wordSort){
                System.out.println("both");
            }else if ( wordSort){
                System.out.println("lexicographically");
            }else if (lenSort){
                System.out.println("lengths");
            }else{
                System.out.println("none");
            }
        }
    }
}
