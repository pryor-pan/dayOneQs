package dayoneQs_3.day48;

/**
 * @Name: Main02
 * @Description:            顺时针打印矩阵
 * @Author: panlai
 * @Date: 2021/8/7 12:46
 */

public class Main02 {
        public int[] clockwisePrint(int[][] mat, int n, int m) {
            int Xstart = 0;
            int Xend = m-1;
            int Ystart = 0;
            int Yend = n-1;
            int index = 0;
            int[] result = new int[n * m];
            while (Xstart <= Xend && Ystart <= Yend) {
                //从左到右打印
                if(Xstart <= Xend) {
                    for (int i = Xstart; i <= Xend; i++) {
                        result[index++] = mat[Ystart][i];
                    }
                }

                //从上往下打印
                if (Ystart < Yend) {
                    for (int i = Ystart + 1; i <= Yend; i++) {
                        result[index++] = mat[i][Xend];
                    }
                }

                //从右往左打印
                if(Xstart < Xend && Yend > Ystart) {
                    for (int i = Xend - 1; i >= Xstart; i--) {
                        result[index++] = mat[Yend][i];
                    }
                }

                //从下往上打印
                if (Ystart < Yend && Xend > Xstart) {
                    for(int i = Yend - 1; i >= Ystart+1; i--) {
                        result[index++] = mat[i][Xstart];
                    }
                }
                Xstart++;
                Xend--;
                Ystart++;
                Yend--;
            }
            return result;
        }
}
