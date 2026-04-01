class Solution {
    public boolean isValidSudoku(char[][] board) {
        int boardSize = board.length;
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<String, HashSet<Character>> squares = new HashMap<>();

        for (int r = 0; r < boardSize; r++) {
            for (int c = 0; c < boardSize; c++) {
                if (board[r][c] == '.') {
                    continue; // checking if cell is empty
                }
            

            String squareKey = (r/3) + "," + (c/3); // creating key to reference squares

            if (rows.computeIfAbsent(r, k -> new HashSet()).contains(board[r][c]) ||
                cols.computeIfAbsent(c, k -> new HashSet()).contains(board[r][c]) ||
                squares.computeIfAbsent(squareKey, k -> new HashSet()).contains(board[r][c])) {
                    return false; 
                    // returns false if any cells contain duplicate.
                }
            
            rows.get(r).add(board[r][c]);
            cols.get(c).add(board[r][c]);
            squares.get(squareKey).add(board[r][c]);
            // if no duplicates are found, then add all cells to storage, to check on next loop
        }
    }
    return true;
    }
}
