package nowcoder.stacks;

import java.util.ArrayList;

/**
 * Remarks: 分条件出栈
 *              给定一个栈及一个操作序列int[][2] ope(C++中为vector<vector<int>>)，代表所进行的入栈出栈操作。第一个元素为1则入栈，
 *              第二个元素为数的正负号；第一个元素为2则出栈，第二个元素若为0则出最先入栈的那个数，为1则出最先入栈的正数，为-1则出最先入栈的负数。
 *              请按顺序返回出栈的序列，并做异常处理忽略错误操作。
 *
 *              测试样例：
 *              [[1,1],[1,-1],[2,0],[2,-1]]
 *              返回：[1,-1]
 *
 * Author:panlai
 * :Date:2021/4/27
 */
public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> output = new ArrayList<Integer>();
        int rows = ope.length;
        for (int i = 0; i < rows; i++) {
            switch (ope[i][0]) {        //判断二维数组中每一行的第一个数字
                //如果是1则表示入栈
                case 1:
                    input.add(ope[i][1]);
                    break;
                //如果是2则表示出栈
                case 2:
                    //如果第二个元素为0则出早入栈的数
                    if (ope[i][1] == 0) {
                        for (int j = 0; j < input.size(); j++) {        //遍历找到最早入栈的数。排在栈底。
                            if (input.get(j) != 0) {                    //将遍历中所有的元素存入output数组中
                                output.add(input.get(j));
                                input.set(j, 0);                        //将遍历中遇到的值置为0，
                                break;
                            }
                        }
                    }
                    //如果第二个元素为1则出最早入栈的正数
                    else if (ope[i][1] == 1) {
                        for (int j = 0; j < input.size(); j++) {
                            if (input.get(j) > 0) {
                                output.add(input.get(j));
                                input.set(j, 0);
                                break;
                            }
                        }
                    }
                    //如果第二个元素为-1则出最早入栈的负数
                    else if (ope[i][1] == -1) {
                        for (int j = 0; j < input.size(); j++) {
                            if (input.get(j) < 0) {
                                output.add(input.get(j));
                                input.set(j, 0);
                                break;
                            }
                        }
                    }
                break;
            }
        }
        return output;
    }
}
