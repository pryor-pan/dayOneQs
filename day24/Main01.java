package dayoneQs_2.day24;

/**
 * Remarks:     年终奖
 * Author:panlai
 * :Date:2021/7/11
 */
public class Main01 {
    public int getMost(int[][] board) {
        // write code here
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 && j == 0) {

                } else if (i == 0) {
                    board[i][j] += board[i][j - 1];
                } else if (j == 0) {
                    board[i][j] += board[i-1][j];
                }else {
                    int temup = board[i-1][j];
                    int templeft = board[i][j-1];
                    if (temup>templeft){
                        board[i][j] += temup;
                    }else{
                        board[i][j] += templeft;
                    }
                }
            }
        }
        return board[board.length-1][board[0].length-1];
    }
}
