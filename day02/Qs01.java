package dayoneQs.day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Remarks:         排序子序列
 * Author:panlai
 * :Date:2021/5/25
 */
public class Qs01 {
    //方法：判断数组是不是有序的
    public static boolean isSorted(int[] data) {
        boolean flag1 = false, flag2 = false;
        //数组是否为升序
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == Math.min(data[i], data[i + 1])) {
                flag1 = true;
            } else {
                flag1 = false;
                break;
            }
        }
        //数组是否为降序
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == Math.max(data[i], data[i + 1])) {
                flag2 = true;
            } else {
                flag2 = false;
                break;
            }
        }
        if (flag1 || flag2) {
            return true;                //有一个为真，即是已经排过序了
        } else {
            return false;
        }
    }
    //反面教材，行不通
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(array));
        System.out.println(isSorted(array));
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            char[] chs = sb.toString().toCharArray();
            int[] test = new int[chs.length];
            for (char ch : chs) {
                //test[i] = Integer.parseInt(chs[i]);
            }
            if (!isSorted(test)) {
                count++;
                i--;
                test = new int[n];
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];        //为了避免指针溢出
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int count = 0;
        while (i < n) {
            //三种情况
            //递增序列
            if (arr[i] < arr[i + 1]) {
                while (i < n && arr[i] < arr[i + 1]) {
                    i++;
                }
                //一个序列遍历完了，计数器++
                count++;
                //去下一个序列
                i++;
                //相等的话只需要下标++即可
            } else if (arr[i] == arr[i + 1]) {
                i++;
                //递减序列
            } else {
                while (i < n && arr[i] > arr[i + 1]) {
                    i++;
                }
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
