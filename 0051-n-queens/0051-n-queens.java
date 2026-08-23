class Solution {

    public boolean isSafe(List<StringBuilder> board, int row, int col, int n) {
        for(int j = 0; j < n; j++) {
            if(board.get(row).charAt(j) == 'Q')
                return false;
        }
        for(int i = 0; i < n; i++) {
            if(board.get(i).charAt(col) == 'Q')
                return false;
        }
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(board.get(i).charAt(j) == 'Q')
                return false;
        }
        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) {
            if(board.get(i).charAt(j) == 'Q')
                return false;
        }
        return true;
    }
    public void nQueens(List<List<String>> ans, 
                        List<StringBuilder> board, 
                        int row, 
                        int n) {

        if(row == n) {
            List<String> ss = new ArrayList<>();
            for(StringBuilder rowstr : board) {
                ss.add(rowstr.toString());
            }
            ans.add(ss);
            return;
        }

        for(int j = 0; j < n; j++) {
            if(isSafe(board,row,j,n)) {
                board.get(row).setCharAt(j,'Q');
                nQueens(ans,board,row+1,n);
                board.get(row).setCharAt(j,'.');
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<StringBuilder> board = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                sb.append('.');
            }
            board.add(sb);
        }
        nQueens(ans,board,0,n);
        return ans;
    }
}