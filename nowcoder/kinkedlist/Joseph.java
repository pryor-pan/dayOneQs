package nowcoder.kinkedlist;

import java.util.*;
/**
 * Remarks: 约瑟夫问题Ⅱ
 *              现有n个人围坐一圈，顺时针给大家编号，第一个人编号为1，然后顺时针开始报数。第一轮依次报1，2，1，2...没报1的人出局。
 *              接着第二轮再从上一轮最后一个报数的人开始依次报1，2，3，1，2，3...没报1的人都出局。以此类推直到剩下以后一个人。
 *              现给定一个int n，要求返回最后一个人的编号。
 *
 *                  测试样例：
 *                      5
 *                      返回：5
 * Author:panlai
 * :Date:2021/4/27
 */
public class Joseph {
    public static int getResult(int n) {
        // write code here
        LinkedList<Integer> arr=new LinkedList<>();
        LinkedList<Integer> res=new LinkedList<>();
        for(int i=1;i<=n;i++) res.add(i);
        int m=2;
        while(true){
            if(arr.size()==0){
                for(int i=0;i<res.size();i++){
                    if(i%m==0) arr.add(res.get(i));
                }
                if(arr.size()==1) return arr.pop();
                res.clear();
                arr.addFirst(arr.removeLast());
            }else if(res.size()==0){
                for(int i=0;i<arr.size();i++){
                    if(i%m==0) res.add(arr.get(i));
                }
                if(res.size()==1) return res.pop();
                arr.clear();
                res.addFirst(res.removeLast());
            }
            m++;
        }
    }
    public static int getResult1(int n ){
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 1; i <= n ; i++) {
            list1.add(i);
        }
        int m = 2;
        while (true){
            if (list2.size() == 0){
                for (int i = 0; i < list1.size(); i++) {
                    if (i%m == 0) list2.add(list1.get(i));
                }
                if (list2.size() == 1) {
                    return list2.pop();
                }
                list1.clear();
                list2.addFirst(list2.removeLast());
            }else if (list1.size() == 0){
                for (int i = 0; i < list2.size(); i++) {
                    if (i%m == 0) list1.add(list2.get(i));
                 }
                if (list1.size() == 1){
                    return list1.pop();
                }
                list2.clear();
                list1.addFirst(list1.removeLast());
            }
            m++;
        }
    }

    public static void main(String[] args) {
        System.out.println(getResult1(5));
    }
}

