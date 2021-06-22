package dayoneQs_2.day17;

import java.util.Scanner;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/6/11
 */
public class Main01 {

    public static int findindex(int n){
        int m = (2*n)-1;
        int[][] array = new int[n][m];
        array[0][0] = 1;
        for (int i = 1; i < n; i++) {
            array[i][0] = array[i][2*i] = 1;
            for (int j = 1; j < 2*i ; j++) {
                if (j == 1){
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
                }else if(j == 2*i-1){
                    array[i][j] = array[i-1][j-2] + array[i-1][j-1];
                }else{
                    array[i][j] = array[i-1][j-2] + array[i-1][j-1] + array[i-1][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (array[n-1][i] %2 == 0){
                return i+1;

            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(findindex(n));
        }

    }
}
