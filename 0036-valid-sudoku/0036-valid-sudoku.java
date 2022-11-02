class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] box = new int[9];
        
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') continue;
                int boxpos = ((i / 3) * 3) + (j / 3);
                int t = 1 << ((int) board[i][j]);
                if ((row[i] & t) > 0 || (col[j] & t) > 0 || (box[boxpos] & t) > 0) {
                    return false;
                }
                row[i] |= t;
                col[j] |= t;
                box[boxpos] |= t;
            }
        }
        
        return true;
    }
}