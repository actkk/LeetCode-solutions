class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {

                    for (int ix = 0; ix < board.length; ix++) {
                        if ((board[i][j] == board[ix][j] && ix != i )|| (board[i][j] == board[i][ix] && ix != j))
                            return false;
                    }


                    int tempx = (i / 3) * 3;
                    int tempy = (j / 3) * 3;

                    for (int ix = tempx; ix < tempx + 3; ix++) {
                        for (int iy = tempy; iy < tempy + 3; iy++) {
                            if ((ix != i || iy != j) && board[i][j] == board[ix][iy])
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
